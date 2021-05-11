package ua.kozhanov.HW4;

import java.util.Arrays;

public class Task1 {

    //Заполнить одномерный массив случайными целочисленными значениями. Найти среднее арифметическое и среднее геометрическое элементов массива
    public static void main(String[] args) {

        int[] fstArray = new int[20]; //показывает, что программа хотя бы выполняется
        int[] scdArray = new int[400];

        //на 400 элементах произведение всех элементов массива "вываливается" что из типа int, что из типа long

        HelperMethodsHWFour.fillArray(fstArray, 100);
        HelperMethodsHWFour.fillArray(scdArray, 32);
        //meanArithmetic = (Arrays.stream(fstArray).sum())/fstArray.length;

        System.out.println(Arrays.toString(fstArray));
        calcArithmAndGeomMeans(fstArray);
        calcArithmAndGeomMeans(scdArray);

    }

    static void calcArithmAndGeomMeans(int[] inputArray) {

        long sum = 0;
        long product = 1L;


        for (int j : inputArray) {

            sum += j;
            product = product * j;

        }

        System.out.println("inputArray of " + inputArray.length + " elements " + "has array sum " + sum + " and product " + product);
        double meanArithmetic = (double) sum / inputArray.length;
        double root = 1.0 / inputArray.length;
        double meanGeometric = Math.pow(product, root);

        System.out.println("Arithmetic mean of the array: " + meanArithmetic + ", geometric mean of the array: " + meanGeometric);

    }
}
