package ua.kozhanov.HW5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    //необходимо поменять местами столбцы и строки массива [n][n]
    public static void main(String[] args) {

        int[][] initMatrix = new int[5][5];
        fillMatrix(initMatrix, 50);
        System.out.println("Initial matrix:");
        for (int[] t : initMatrix) {
            System.out.println(Arrays.toString(t));
        }

        int[][] swapMatrix = swapMatrix(initMatrix);
        System.out.println("Swapped matrix:");
        for (int[] p : swapMatrix) {

            System.out.println(Arrays.toString(p));

        }

    }

    static void fillMatrix(int[][] inputMatrix, int bound) {

        for (int i = 0; i < inputMatrix.length; i++) {

            for (int j = 0; j < inputMatrix.length; j++) {

                inputMatrix[i][j] = new Random().nextInt(bound);

            }
        }
    }

    static int[][] swapMatrix(int[][] inputMatrix) {

        int originalRowsAmount = inputMatrix.length;
        int originalColumnsAmount = inputMatrix[0].length;

        int[][] newMatrix = new int[originalColumnsAmount][originalRowsAmount];

        for (int i = 0; i < originalRowsAmount; i++) {
            for (int j = 0; j < originalColumnsAmount; j++) {
                newMatrix[j][i] = inputMatrix[i][j];
            }
        }
        return newMatrix;

    }
}
