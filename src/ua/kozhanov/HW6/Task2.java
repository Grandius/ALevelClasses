package ua.kozhanov.HW6;

public class Task2 {

    /*
    * Программа говорит, что проблема в строке 34, и там я устанавливаю первый breakpoint.
    * Вижу, что сразу выходит за «пределы» массива.
    * Смотрю на код и вижу, что в условии строки 33 for (int j = 0; i < triangle[i].length; j++) указано i < triangle[i].length, а должно быть j.
    * Меняю в for (int j = 0; i < triangle[i].length; j++) на for (int j = 0; j < triangle[i].length; j++), проверяю, программа запускается.
    * */
    public static void main(String[] args) {
        int[][] triangle = new int[5][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }

        }

        for (int[] ints : triangle) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }

}
