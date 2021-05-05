package ua.kozhanov.HW3;

import java.util.Scanner;

public class StringScanner {

    static String returnString(Scanner sc) {

        String outputText = "";
        if (sc.hasNextLine()) {
            outputText = sc.nextLine();
            sc.next();
        } else if (!sc.hasNextLine()) {
            System.out.println("Error has occurred, please input text");
            sc.next();
            outputText = returnString(sc);
        }
        return outputText;
    }
}
