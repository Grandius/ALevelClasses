package ua.kozhanov.Module1;

import java.util.Arrays;

public class Task1 {
    //Найти количество различных/уникальных элементов массива

    public static void main(String[] args) {

        int[] arr = {10, 10, 9, 45, 2, 10, 10, 45};
        System.out.println(Arrays.toString(arr));
        System.out.println("There are " + countDistinct(arr) + " distinct elements in the array: ");
        printDistinct(arr);
    }

    static int countDistinct(int[] inputArray) {

        int result = 0;
        for (int i = 0; i < inputArray.length; i++) {

            int j;
            for (j = 0; j < i; j++) {
                if (inputArray[i] == inputArray[j])
                    break;
            }
            if (i == j) {
                result++;
            }

        }
        return result;
    }

    static void printDistinct(int[] inputArray) {

        String separator = "";
        for (int i = 0; i < inputArray.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (inputArray[i] == inputArray[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(separator + " " + inputArray[i]);
                separator = ",";
            }
        }
    }
}
