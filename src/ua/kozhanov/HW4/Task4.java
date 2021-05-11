package ua.kozhanov.HW4;

import java.util.Arrays;

public class Task4 {

    //Заполнить одномерный массив случайными целочисленными значениями. Все четные значения заменить на нули.
    public static void main(String[] args) {

        int[] numbersArray = new int[2000];

        HelperMethodsHWFour.fillArray(numbersArray, 100);
        System.out.println(Arrays.toString(numbersArray));

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                numbersArray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(numbersArray));
    }
}
