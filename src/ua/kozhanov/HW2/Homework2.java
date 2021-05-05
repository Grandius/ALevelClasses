package ua.kozhanov.HW2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number");
        checkIfNumberIsEven(HelperMethods.returnInteger(input));
        input.nextLine();
        calcTheSmallestAbs(input);
        input.close();
    }

    //метод будет сообщать, является ли целое число, переданное в метод, чётным или нет.
    static void checkIfNumberIsEven(int number) {

        if ((number % 2) == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is not even");
        }
    }

    //Задание по выведению на экран меньшего по модулю из 3 переданных в метод вещественных чисел (с использованием тернарной операции)
    static void calcTheSmallestAbs(Scanner sc) {

        double firstNum;
        double secondNum;
        double thirdNum;

        System.out.println("Enter first real number");
        firstNum = HelperMethods.returnDouble(sc);
        System.out.println("Enter second real number");
        secondNum = HelperMethods.returnDouble(sc);
        System.out.println("Enter third real number");
        thirdNum = HelperMethods.returnDouble(sc);
        System.out.println("Absolute smallest of three real numbers: " + HelperMethods.returnSmallestAbs(firstNum, secondNum, thirdNum));
    }
}
