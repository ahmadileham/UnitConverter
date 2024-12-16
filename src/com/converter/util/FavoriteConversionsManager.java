package com.converter.util;

import java.util.HashMap;
import java.util.Map;

public class FavoriteConversionsManager {
    private final Map<String, String> favorites = new HashMap<>();

    // Add a favorite conversion
    public void addFavorite(String name, String conversion) {
        favorites.put(name, conversion);
    }

    // Get all favorite conversions
    public Map<String, String> getFavorites() {
        return new HashMap<>(favorites); // Return a copy to avoid external modifications
    }

    // Get a specific favorite conversion by name
    public String getFavorite(String name) {
        return favorites.get(name);
    }

    // Remove a favorite conversion by name
    public void removeFavorite(String name) {
        favorites.remove(name);
    }
}
