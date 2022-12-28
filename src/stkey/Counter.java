package stkey;

import java.util.HashMap;

/**
 * @author stkey
 * @add closeProcess
 * @since 17.12.2022
 */
public class Counter {
    /**
     * Closed Cabinets Counter
     */
    public void numbersofClosed() {
        HashMap<Integer, String> numbersofClosed = new HashMap<>();
        ClosedProcess closedProcess = new ClosedProcess();
        numbersofClosed = closedProcess.close();
        int numbers = 0;
        for (int i = 1; i < 1001; i++) {
            if (numbersofClosed.get(i).equalsIgnoreCase("Open")) {
                numbers++;
                System.out.println(i + ". Cabinet is Opened");
            }
        }
        System.out.println(numbers);
    }
}

