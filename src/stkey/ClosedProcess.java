package stkey;
import java.util.HashMap;

/**
 * This method for constructing of opened-closed cabinets in hashmap
 *
 * @author stkey
 * @components cabinet
 * @return closed
 * @since 17.12.2022
 */
public class ClosedProcess {
    /**
     * @return closed
     */
    public HashMap<Integer, String> close() {
        HashMap<Integer, String> closed = new HashMap<>();
        Cabinet cabinet = new Cabinet();
        closed = cabinet.cabinetDefinition();
        for (int j = 1; j <= 1000; j++) {
            for (int i = 1; i <= 1000; i++) {
                if (i % j == 0) {
                    if (closed.get(i).equalsIgnoreCase("Open")) {
                        closed.put(i, "Close");
                        System.out.println(i + ". Cabinet Closed  " + j + " sırasında");
                    } else {
                        closed.put(i, "Open");
                        System.out.println(i + ". Cabinet Opened  "  + j + " sırasında");
                    }
                }
            }
        }
        return closed;
    }
}
