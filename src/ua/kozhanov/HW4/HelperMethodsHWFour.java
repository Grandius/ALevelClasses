package ua.kozhanov.HW4;

import java.util.Random;

public class HelperMethodsHWFour {

    static int[] fillArray (int[] inputArray, int bound) {

        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = new Random().nextInt(bound);

        }
        return inputArray;
    }


}
