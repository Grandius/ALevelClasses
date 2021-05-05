package ua.kozhanov.HW2;

import java.util.Scanner;

public class HelperMethods {

    static double returnDouble(Scanner sc) {

        double retNum = 0;
        if (sc.hasNextDouble()) {
            retNum = sc.nextDouble();
            sc.nextLine();
        } else if (!sc.hasNextDouble()) {
            System.out.println("Error has occurred, please input correct real number in XX,XX form");
            sc.nextLine();
            retNum = returnDouble(sc);
        }

        if (retNum == 0) {

            System.out.println("Error has occurred, please input correct real number in XX,XX form");
            retNum = returnDouble(sc);
        }

        return retNum;
    }

    static int returnInteger(Scanner sc) {

        int retInt = 0;
        if (sc.hasNextInt()) {
            retInt = sc.nextInt();
            sc.nextLine();
        } else if (!sc.hasNextInt()) {
            System.out.println("Error has occurred, please input correct integer number");
            sc.nextLine();
            retInt = returnInteger(sc);
        }
        return retInt;
    }

    static double returnSmallestAbs(double a, double b, double c) {

        double smallAbs = 0;
        double absFirst = a < 0 ? -a : a;
        double absSecond = b < 0 ? -b : b;
        double absThird = c < 0 ? -c : c;

        if (absFirst < absSecond && absFirst < absThird) {
            smallAbs = absFirst;
        } else if (absSecond < absFirst && absSecond < absThird) {
            smallAbs = absSecond;
        } else if (absThird < absFirst && absThird < absSecond) {
            smallAbs = absThird;
        }

        return smallAbs;

        /*boolean[] smallAbsCheck = new boolean[3];
        smallAbsCheck[0] = a<b&&a<c;
        smallAbsCheck[1] = b<a&&b<c;
        smallAbsCheck[2] = c<a&&c<b;
        if (true == a < b && a < c) {
            smallAbs = (float) a;
        }*/

    }

    static double calcDistance(int px1, int py1, int px2, int py2)  {

        double dx = (double) px1 - px2;
        double dy = (double) py1 - py2;
        return Math.sqrt(dx * dx + dy * dy);

        //return Math.sqrt((px1 - px2) * (px1 - px2) + (py1 - py2) * (py1 - py2));
    }


}
