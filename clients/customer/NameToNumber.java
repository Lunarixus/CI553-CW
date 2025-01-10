package clients.customer;

import java.util.HashMap;
import java.util.Map;

public class NameToNumber {

    private final HashMap<String, String> nameToNumberMap;

    // Constructor with predefined mappings
    public NameToNumber() {
        this.nameToNumberMap = new HashMap<>();
        initializePredefinedMappings();
    }

    /**
     * Populates the HashMap with predefined name-to-number mappings.
     */
    private void initializePredefinedMappings() {
        nameToNumberMap.put("TV", "0001");
        nameToNumberMap.put("Radio", "0002");
        nameToNumberMap.put("Toaster", "0003");
        nameToNumberMap.put("Watch", "0004");
        nameToNumberMap.put("Camera", "0005");
        nameToNumberMap.put("MP3 Player", "0006");
        nameToNumberMap.put("USB Drive", "0007");
    }

    /**
     * Searches for a term in the given string and retrieves its unique number from the predefined table.
     *
     * @param input The input string to search for a term.
     * @return The unique 4-digit number as a String, or "" if no term matches.
     */
    public String getNumberForName(String input) {
        for (Map.Entry<String, String> entry : nameToNumberMap.entrySet()) {
            if(input == null) {
                return "";
            }
            if (input.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "";
    }
}
