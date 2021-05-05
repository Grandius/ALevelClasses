package ua.kozhanov.HW3;

import java.util.Scanner;

public class Task2 {

    //Удалить из строки пробелы и определить, является ли она перевертышем
    //Ввести строковую переменную. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.

    public static void main(String[] args) {

        /*String text1 = "Do you want more of these French fries?";
        System.out.println("The string " + "'" + text1 + "'" + " is a palindrome: " + isPalindrome(text1));

        String text2 = "Tenet tenet";
        System.out.println("The string " + "'" + text2 + "'" + " is a palindrome: " + isPalindrome(text2));*/
        //String text = StringScanner.returnString(input);
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("The string " + "'" + text + "'" + " is a palindrome: " + isPalindrome(text));
    }

    static boolean isPalindrome(String input) {

        //String temp = input.trim();
        String temp = input.replaceAll(" ", "");
        StringBuilder sbInit = new StringBuilder(temp.toLowerCase());
        System.out.println("Initial text: " + sbInit);
        StringBuilder sbOut = sbInit.reverse();
        System.out.println("Reversed text: " + sbOut);
        String output = sbOut.toString();
        return output.equalsIgnoreCase(temp);
        /*System.out.println("wtf " + sbOut.compareTo(sbInit));
          if (sbInit.compareTo()
            check = true;
        } else {
            check = false;
        }*/


    }
}
