package ua.kozhanov.HW5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    //Проверить заданный массив на упорядоченность по невозрастанию
    public static void main(String[] args) {

        int[] array = new int[10];
        fillArray(array, 50);
        System.out.println(Arrays.toString(array));
        System.out.println("The array is properly descending: " + checkForDesc(array));

        //to show that the algorithm works
        int[] testArray = {27, 19, 15, 9, 6, 4, 1, 0, -1};
        System.out.println(Arrays.toString(testArray));
        System.out.println("The array is properly descending: " + checkForDesc(testArray));


    }

    static void fillArray(int[] inputArray, int bound) {

        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = new Random().nextInt(bound);

        }
    }

    static boolean checkForDesc(int[] inputArray) {

        boolean[] checkArray = new boolean[inputArray.length - 1];
        boolean temp = true;

        for (int i = 1; i < inputArray.length; i++) {

            checkArray[i - 1] = inputArray[i - 1] >= inputArray[i];
            temp = temp && checkArray[i - 1];

        }
        return temp;
    }
}
