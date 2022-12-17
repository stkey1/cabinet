package stkey;

import java.util.HashMap;

/**
 * @author stkey
 * @add closeProcess
 * @since 17.12.2022
 */
public class Sayac {

    public void sayac() {
        HashMap<Integer, String> numbersofClosed = new HashMap<>();
        CloseProcess closeProcess = new CloseProcess();
        numbersofClosed = closeProcess.close();
        int sayac = 0;
        for (int i = 1; i < 1001; i++) {
            if (numbersofClosed.get(i).equalsIgnoreCase("Open")) {
                sayac++;
                System.out.println(i + ". Cabinet is Opened");
            }
        }
        System.out.println(sayac);
    }
}
