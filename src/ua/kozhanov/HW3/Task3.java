package ua.kozhanov.HW3;

import java.util.Scanner;

public class Task3 {

    //Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input some line");
        String text = input.nextLine();
        System.out.println("The string " + "'" + text + "'" + " has " + calcWords(text) + " word(s)");

    }

    static int calcWords(String input) {

        //String[] values = input.replaceAll("^[,\\s]+", "").split("[,\\s]+"); this variant works the same
        String[] values = input.split(" ");
        int countWords = 0;
        for (String value : values) {
            if (!value.equals("") && value.matches("^[a-zA-Z]*$") && !value.matches("^[0-9]*$")) {
                countWords++;
            }
        }

        return countWords;
    }
}
