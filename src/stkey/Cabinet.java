package stkey;

import java.util.HashMap;

/**
 * This method for creating opened cabinets
 * @author stkey
 * @return cabinets
 * @since 17.12.2022
 */
public class Cabinet {
    /**
     * @return cabinets
     */
    public HashMap<Integer, String> cabinetDefinition() {
        HashMap<Integer, String> cabinets = new HashMap<>();
        for (int i = 1; i < 1001; i++) {
            cabinets.put(i,"Close");
        }
        return cabinets;
    }
}
