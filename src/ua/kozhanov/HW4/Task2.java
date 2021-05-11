package ua.kozhanov.HW4;

import java.util.Arrays;

public class Task2 {

    //Заполнить одномерный массив случайными целочисленными значениями. Проверить сколько простых чисел присутствует в массиве.
    public static void main(String[] args) {

        //prime numbers are only positive

        int[] numbersArray = new int[1000];
        HelperMethodsHWFour.fillArray(numbersArray, 100);
        System.out.println(Arrays.toString(numbersArray));

        System.out.println("Number of prime numbers in the numbersArray is " + getPrimeCount(numbersArray));


    }

    private static int getPrimeCount(int[] inputArray) {

        int primeCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (isPrime(inputArray[i])) {


                primeCount++;
            }
        }
        System.out.println();
        return primeCount;
    }

    private static boolean isPrime(final int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
}