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
public class CloseProcess {
    public HashMap<Integer, String> close() {
        HashMap<Integer, String> closed = new HashMap<>();
        Cabinet cabinet = new Cabinet();
        closed = cabinet.cabinet();
        for (int i = 1; i < 1001; i++) {
            if (i % 2 == 0) {
                if (closed.get(i).equalsIgnoreCase("Open")) {
                    closed.put(i, "Close");
                    System.out.println(i + ". Cabinet Closed 2");
                } else {
                    closed.put(i, "Open");
                    System.out.println(i + ". Cabinet Opened  2");
                }
            }
        }
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0) {
                if (closed.get(i).equalsIgnoreCase("Open")) {
                    closed.put(i, "Close");
                    System.out.println(i + ". Cabinet Closed 3");
                } else {
                    closed.put(i, "Open");
                    System.out.println(i + ". Cabinet Opened 3");
                }
            }
        }
        for (int i = 1; i < 1001; i++) {
            if (i % 4 == 0) {
                if (closed.get(i).equalsIgnoreCase("Open")) {
                    closed.put(i, "Close");
                    System.out.println(i + ". Cabinet Closed 4");
                } else {
                    closed.put(i, "Open");
                    System.out.println(i + ". Cabinet Opened 4");
                }
            }
        }
        for (int i = 1; i < 1001; i++) {
            if (i % 5 == 0) {
                if (closed.get(i).equalsIgnoreCase("Open")) {
                    closed.put(i, "Close");
                    System.out.println(i + ". Cabinet Closed 5");
                } else {
                    closed.put(i, "Open");
                    System.out.println(i + ". Cabinet Opened 5");
                }
            }
        }
        return closed;
    }
}
