package ua.kozhanov.HW5;

import java.util.Arrays;

public class Task1 {

    //Заполнить двумерный массив значениями индекса, при этом каждую вторую строку - отрицательными значениями
    public static void main(String[] args) {

        int[][] matrix = new int[5][10];
        fillMatrix(matrix);
        for (int[] tar : matrix) {

            System.out.println(Arrays.toString(tar));

        }

    }

    static void fillMatrix(int[][] inputMatrix) {

        int temp = 0;
        for (int i = 0; i < inputMatrix.length; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < inputMatrix[i].length; j++) {
                    inputMatrix[i][j] = temp;
                    temp++;
                }
            } else {

                for (int j = 0; j < inputMatrix[i].length; j++) {
                    inputMatrix[i][j] = -temp;
                    temp++;
                }
            }
        }
    }
}
