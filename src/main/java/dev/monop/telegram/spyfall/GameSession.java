package dev.monop.telegram.spyfall;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a single Spyfall game session with players, location, and roles.
 * Keeps game state for one chat.
 */
public class GameSession {
    private final List<String> players;
    private final String location;
    private final String spy;

    public GameSession(List<String> playerNames, List<String> possibleLocations) {
        this.players = new ArrayList<>(playerNames);
        Random random = new Random();
        this.location = possibleLocations.get(random.nextInt(possibleLocations.size()));
        this.spy = players.get(random.nextInt(players.size()));
    }

    public List<String> getPlayers() {
        return players;
    }

    public String getLocation() {
        return location;
    }

    public String getSpy() {
        return spy;
    }
}
