package ua.kozhanov.HW1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        outputNameDate();
        reverseNumber();

    }

    //Создать консольное приложение, которое выводит в консоль Ваши имя, фамилию и текущую дату/время
    static void outputNameDate() {

        LocalDateTime date = LocalDateTime.now();
        System.out.println("Name: " + "Adrian" + ", Surname: " + "Kozhanov" + ", Current Date and Time: " + date);

    }

    //Создать приложение, которое ожидает на ввод в консоль число и выводит его в обратном порядке
    //в качестве примера берётся тип int, но вообще это можно делать через hasNext() и затем работать через String
    static void reverseNumber() {

        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("Please input natural number");
        if (input.hasNextInt()) {

            num = input.nextInt();

        } else {
            System.out.println("Please input correct natural number");
        }

        if (num == 0) {

            System.out.println("You typed either zero or NaN, please type correct natural number!");

        } else {

            String strOrder = Integer.toString(num);
            char[] array = strOrder.toCharArray();
            if (strOrder.length() == 1) {

                System.out.println("Your number is: " + num + ", it cannot be reversed");
            } else {

                for (int i = strOrder.toCharArray().length - 1; i >= 0; i--) {

                    System.out.print(array[i]);
                }
            }
        }
    }
}
