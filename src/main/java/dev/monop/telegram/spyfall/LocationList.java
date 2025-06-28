package dev.monop.telegram.spyfall;

import java.util.Arrays;
import java.util.List;

/**
 * Provides the standard locations used in a game of Spyfall.
 */
public class LocationList {
    public static List<String> getDefaultLocations() {
        return Arrays.asList(
            "Beach", "Casino", "Cathedral", "Circus Tent", "Corporate Party", "Crusader Army", "Day Spa", "Embassy", "Hospital", "Hotel", "Military Base", "Movie Studio", "Ocean Liner", "Passenger Train", "Pirate Ship", "Polar Station", "Police Station", "Restaurant", "School", "Service Station", "Space Station", "Submarine", "Supermarket", "Theater", "University"
        );
    }
}
