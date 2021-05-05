package ua.kozhanov.HW3;

import java.util.Scanner;

public class Task3 {

    //Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

    public static void main(String[] args) {

        /*String text1 = "Anyways";
        System.out.println("The string " + "'" + text1 + "'" + " has " + (calcSpaces(text1) + 1) + " word(s)");
        System.out.println("The string " + "'" + text1 + "'" + " has " + calcWords(text1) + " word(s) (counted with calcWords function)");
        String text2 = "Tenet tenet";
        System.out.println("The string " + "'" + text2 + "'" + " has " + (calcSpaces(text2) + 1) + " word(s)");
        String text3 = "Do you want more of these French fries?";
        System.out.println("The string " + "'" + text3 + "'" + " has " + (calcSpaces(text3) + 1) + " word(s)");
        System.out.println("The string " + "'" + text3 + "'" + " has " + calcWords(text3) + " word(s) (counted with calcWords function)");*/
        //String text = StringScanner.returnString(input);
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("The string " + "'" + text + "'" + " has " + (calcSpaces(text) + 1) + " word(s)");
        System.out.println("The string " + "'" + text + "'" + " has " + calcWords(text) + " word(s) (counted with calcWords function)");

    }

    static int calcSpaces(String input) {

        int countSpaces = 0;
        for (char element : input.toCharArray()) {
            if (element == ' ') countSpaces++;
        }

        return countSpaces;
    }

    static int calcWords(String input) {

        return input.split(" ").length;
    }
}
