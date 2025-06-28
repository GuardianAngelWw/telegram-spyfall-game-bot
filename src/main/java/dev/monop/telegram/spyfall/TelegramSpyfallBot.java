package dev.monop.telegram.spyfall;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Main Telegram Bot for Spyfall gameplay.
 * Implements commands, inline queries, modern UI features as per Google Java style.
 */
public class TelegramSpyfallBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        // TODO: Replace with bot's username
        return "YourBotUsername";
    }

    @Override
    public String getBotToken() {
        // TODO: Replace with bot's token
        return "YourBotToken";
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Entry-point for incoming Telegram updates (messages, inline, commands, etc.)
        // Modular logic will be invoked here
    }
}
