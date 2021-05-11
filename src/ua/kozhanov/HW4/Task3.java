package ua.kozhanov.HW4;

import java.util.Arrays;

public class Task3 {

    //Заполнить одномерный массив случайными целочисленными значениями. Проверить сколько составных чисел присутствует в массиве.
    public static void main(String[] args) {

        int[] numbersArray = new int[1000];
        HelperMethodsHWFour.fillArray(numbersArray, 100);
        System.out.println(Arrays.toString(numbersArray));

        System.out.println("Number of composite numbers in the numbersArray is " + getCompositeCount(numbersArray));

    }

    private static int getCompositeCount(int[] inputArray) {

        int compositeCount = 0;
        for (int j : inputArray) {
            if (!isPrime(j) && !(j == 1 || j == 0)) {
                System.out.print(j + ", ");

                compositeCount++;
            }
        }
        System.out.println();

        return compositeCount;

    }

    private static boolean isPrime(final int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
}
