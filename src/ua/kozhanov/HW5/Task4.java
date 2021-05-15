package ua.kozhanov.HW5;

import java.util.Arrays;

public class Task4 {

    //Удалить из массива k-й элемент со сдвигом всех расположенных справа от него элементов на одну позицию влево
    public static void main(String[] args) {

        int[] array = new int[100];
        Task2.fillArray(array, 50);
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(array));
        int delElem = 5;
        int[] arrayMinusElement = deleteElement(array, delElem);
        System.out.println("Array without element " + delElem);
        System.out.println(Arrays.toString(arrayMinusElement));
    }

    static int[] deleteElement(int[] inputArray, int elementIndex) {

        int[] newArray = new int[inputArray.length - 1];
        if (elementIndex >= inputArray.length) {

            System.out.println("Element doesn't exist in this array, cannot be deleted");
        } else {

            System.arraycopy(inputArray, 0, newArray, 0, elementIndex);
            System.arraycopy(inputArray, elementIndex+1, newArray, elementIndex, inputArray.length - elementIndex-1);

        }
        return newArray;
    }
}
