package ua.kozhanov.HW3;

import java.util.Scanner;

public class Task3 {

    //Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

    public static void main(String[] args) {

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
