package ua.kozhanov.Module1;

public class Task2 {
    //Ход коня по шахматной доске. Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход. Программа должна проверить, возможно ли это сделать.


    public static void main(String[] args) {

        String move1 = "A1-B3";
        String move2 = "A1-C2";
        String move3 = "A1-C3";
        String move4 = "F6-H4";

        System.out.println("Move " + "'" + move1 + "'" + " is possible for knight: " + isCorrectKnightMove(move1));
        System.out.println("Reverse move " + "'" + move1 + "'" + " is possible for knight: " + isCorrectKnightMove("B3-A1"));
        System.out.println("Move " + "'" + move2 + "'" + " is possible for knight: " + isCorrectKnightMove(move2));
        System.out.println("Reverse move " + "'" + move2 + "'" + " is possible for knight: " + isCorrectKnightMove("C2-A1"));
        System.out.println("Move " + "'" + move3 + "'" + " is possible for knight: " + isCorrectKnightMove(move3));
        System.out.println("Reverse move " + "'" + move3 + "'" + " is possible for knight: " + isCorrectKnightMove("C3-A1"));
        System.out.println("Move " + "'" + move4 + "'" + " is possible for knight: " + isCorrectKnightMove(move4));
        System.out.println("Reverse move " + "'" + move4 + "'" + " is possible for knight: " + isCorrectKnightMove("H4-F6"));

        System.out.println("Move " + "'" + move1 + "'" + " is possible for knight: " + isPossibleKnightMove("a1", "b3"));
        System.out.println("Reverse move 'B3-A1' is possible for knight: " + isPossibleKnightMove("b3", "a1"));
        System.out.println("Move " + "'" + move2 + "'" + " is possible for knight: " + isPossibleKnightMove("a1", "c2"));
        System.out.println("Reverse move 'C2-A1' is possible for knight: " + isPossibleKnightMove("c2", "a1"));
        System.out.println("Move " + "'" + move3 + "'" + " is possible for knight: " + isPossibleKnightMove("a1", "c3"));
        System.out.println("Reverse move 'C3-A1' is possible for knight: " + isPossibleKnightMove("c3", "a1"));
    }

    //first simpler method of checking if the move of a knight figure is correct
    static boolean isCorrectKnightMove(String move) {
        if (move.matches("[A-H][1-8]-[A-H][1-8]")) {
            int x = Math.abs(move.charAt(0) - move.charAt(3));
            int y = Math.abs(move.charAt(1) - move.charAt(4));

            return x + y == 3;
        } else {
            return false;
        }

    }

    //second method of checking if the move of a knight figure is correct
    static boolean isPossibleKnightMove(String from, String to) {
        if (!isValidChar(from.toUpperCase().charAt(0), 'A', 'H')) return false;
        if (!isValidChar(to.toUpperCase().charAt(0), 'A', 'H')) return false;
        if (!isValidChar(from.charAt(1), '1', '8')) return false;
        if (!isValidChar(to.charAt(1), '1', '8')) return false;
        int subsChars = Math.abs(from.toUpperCase().charAt(0) - to.toUpperCase().charAt(0));
        int subsNum = Math.abs(from.charAt(1) - to.charAt(1));
        if (subsChars == 2)
            return subsNum == 1;
        else if (subsChars == 1)
            return subsNum == 2;
        return false;
    }

    static boolean isValidChar(char verifiableChar, char lower, char upper) {
        return (verifiableChar <= upper) && (verifiableChar >= lower);
    }


}
