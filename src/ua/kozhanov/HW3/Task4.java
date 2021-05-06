package ua.kozhanov.HW3;

import java.util.Scanner;

public class Task4 {

    //Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 100);
        System.out.println("Please input an integer number");
        checkInputForGuessingTheNumber(input, a);


    }

    static int returnInteger(Scanner sc) {

        int retInt = 0;
        if (sc.hasNextInt()) {
            retInt = sc.nextInt();
            sc.nextLine();
        } else if (!sc.hasNextInt()) {
            System.out.println("Error has occurred, please input correct integer number");
            sc.nextLine();
            retInt = returnInteger(sc);
        }
        return retInt;
    }

    static void checkInputForGuessingTheNumber(Scanner sc, int compNumber) {

        int tempInt;
        do {
            tempInt = returnInteger(sc);
            if (tempInt > compNumber) {
                System.out.println("Less then " + tempInt);
            } else if (tempInt < compNumber) {
                System.out.println("More then " + tempInt);
            }
        }
        while (tempInt != compNumber);
        System.out.println("Correct");
    }
}
