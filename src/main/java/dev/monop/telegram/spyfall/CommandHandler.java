package dev.monop.telegram.spyfall;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * CommandHandler handles /startgame and /join commands.
 */
public class CommandHandler {
    // Map chatId -> Set of players joining that game
    private final Map<Long, Set<String>> lobby = new HashMap<>();

    public String handleCommand(Update update) {
        Message msg = update.getMessage();
        String text = msg.getText();
        Long chatId = msg.getChatId();
        String user = msg.getFrom().getUserName();

        if (text.startsWith("/startgame")) {
            lobby.put(chatId, new HashSet<>());
            return "Spyfall: New game created! Players, type /join to enter.";
        }
        if (text.startsWith("/join")) {
            lobby.computeIfAbsent(chatId, k -> new HashSet<>());
            lobby.get(chatId).add(user);
            return user + " joined the game.";
        }
        return null;
    }

    public Set<String> getPlayers(long chatId) {
        return lobby.getOrDefault(chatId, new HashSet<>());
    }
}