package com.converter.util;

import java.util.ArrayList;
import java.util.List;

public class ConversionHistoryManager {
    private final List<String> history = new ArrayList<>();

    // Add a conversion record
    public void addRecord(String record) {
        history.add(record);
    }

    // View all conversion history
    public List<String> getHistory() {
        return new ArrayList<>(history); // Return a copy to avoid external modifications
    }

    // Delete a specific conversion record by index
    public void deleteRecord(int index) {
        if (index >= 0 && index < history.size()) {
            history.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index for deletion.");
        }
    }

    // Clear all history
    public void clearHistory() {
        history.clear();
    }
}
