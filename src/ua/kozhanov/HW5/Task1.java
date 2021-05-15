package ua.kozhanov.HW5;

import java.util.Arrays;

public class Task1 {

    //Заполнить двумерный массив значениями индекса, при этом каждую вторую строку - отрицательными значениями
    public static void main(String[] args) {

        int[][] array = new int[5][10];
        fillArray(array);
        for (int[] tar : array) {

            System.out.println(Arrays.toString(tar));

        }

    }

    static void fillArray(int[][] inputArray) {

        int temp = 0;
        for (int i = 0; i < inputArray.length; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = temp;
                    temp++;
                }
            } else {

                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = -temp;
                    temp++;
                }
            }
        }
    }
}
