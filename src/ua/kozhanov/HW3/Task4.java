package ua.kozhanov.HW3;

import ua.kozhanov.HW2.HelperMethods;

import java.util.Scanner;

public class Task4 {

    //Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 100);

        System.out.println("Please input an integer number");
        String temp;
        do {

            temp = checkInputForGuessingTheNumber(input, a);
            System.out.println(temp);
        }
        while (temp.compareTo("Correct") != 0);

    }

    static String checkInputForGuessingTheNumber(Scanner sc, int compNumber) {

        int tempInt = HelperMethods.returnInteger(sc);
        String result;
        if (tempInt > compNumber) {
            result = "The computer number is less then " + tempInt;
        } else if (tempInt < compNumber) {
            result = "The computer number is more then " + tempInt;
        } else {
            result = "Correct";
        }
        return result;
    }
}
