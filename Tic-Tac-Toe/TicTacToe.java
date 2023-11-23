import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        String[][] ticTacToe = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}};

        System.out.println("------------ TIC-TAC-TOE ------------");

        int round = 1;

        boolean gameOver = gameValid(ticTacToe);

        while(gameOver == false) {
            System.out.println();
            printTable(ticTacToe);
            System.out.println();
            if(round % 2 != 0){
                System.out.println("X round = choose a number: ");
                Scanner myObj = new Scanner(System.in);
                String numberChosed = myObj.nextLine();
                markNumberX(numberChosed, ticTacToe);
                gameOver = gameValid(ticTacToe);
            } else if (round % 2 == 0) {
                System.out.println("0 round = choose a number: ");
                Scanner myObj = new Scanner(System.in);
                String numberChosed2 = myObj.nextLine();
                markNumber0(numberChosed2, ticTacToe);
                gameOver = gameValid(ticTacToe);
            }
            round = round + 1;
        }

        printTable(ticTacToe);
        System.out.println("Game Over!");
    }

    private static boolean gameValid(String[][] ticTacToe) {

        // Lines check for X
        if(ticTacToe[0][0].equals("X")
                && ticTacToe[0][1].equals("X")
                && ticTacToe[0][2].equals("X")) {
            return true;
        } else if(ticTacToe[1][0].equals("X")
                && ticTacToe[1][1].equals("X")
                && ticTacToe[1][2].equals("X")) {
            return true;
        }
            else if(ticTacToe[2][0].equals("X")
                    && ticTacToe[2][1].equals("X")
                    && ticTacToe[2][2].equals("X")) {
            return true;
        }

        // Columns check for X
        if(ticTacToe[0][0].equals("X")
                && ticTacToe[1][0].equals("X")
                && ticTacToe[2][0].equals("X")) {
            return true;
        } else if(ticTacToe[0][1].equals("X")
                && ticTacToe[1][1].equals("X")
                && ticTacToe[2][1].equals("X")) {
            return true;
        }
        else if(ticTacToe[0][2].equals("X")
                && ticTacToe[1][2].equals("X")
                && ticTacToe[2][2].equals("X")) {
            return true;
        }

        // Diagonal check for X
        if(ticTacToe[0][0].equals("X")
                && ticTacToe[1][1].equals("X")
                && ticTacToe[2][2].equals("X")) {
            return true;
        } else if(ticTacToe[0][2].equals("X")
                && ticTacToe[1][1].equals("X")
                && ticTacToe[2][0].equals("X")) {
            return true;
        }

        // Lines check for 0
        if(ticTacToe[0][0].equals("0")
                && ticTacToe[0][1].equals("0")
                && ticTacToe[0][2].equals("0")) {
            return true;
        } else if(ticTacToe[1][0].equals("0")
                && ticTacToe[1][1].equals("0")
                && ticTacToe[1][2].equals("0")) {
            return true;
        }
        else if(ticTacToe[2][0].equals("0")
                && ticTacToe[2][1].equals("0")
                && ticTacToe[2][2].equals("0")) {
            return true;
        }

        // Columns check for 0
        if(ticTacToe[0][0].equals("0")
                && ticTacToe[1][0].equals("0")
                && ticTacToe[2][0].equals("0")) {
            return true;
        } else if(ticTacToe[0][1].equals("0")
                && ticTacToe[1][1].equals("0")
                && ticTacToe[2][1].equals("0")) {
            return true;
        }
        else if(ticTacToe[0][2].equals("0")
                && ticTacToe[1][2].equals("0")
                && ticTacToe[2][2].equals("0")) {
            return true;
        }

        // Diagonal check for 0
        if(ticTacToe[0][0].equals("0")
                && ticTacToe[1][1].equals("0")
                && ticTacToe[2][2].equals("0")) {
            return true;
        } else if(ticTacToe[0][2].equals("0")
                && ticTacToe[1][1].equals("0")
                && ticTacToe[2][0].equals("0")) {
            return true;
        }

        // Check if all spots are marked
        if (ticTacToe[0][0].equals("1")
                || ticTacToe[0][1].equals("2")
                || ticTacToe[0][2].equals("3")
                || ticTacToe[1][0].equals("4")
                || ticTacToe[1][1].equals("5")
                || ticTacToe[1][2].equals("6")
                || ticTacToe[2][0].equals("7")
                || ticTacToe[2][1].equals("8")
                || ticTacToe[2][2].equals("9")
        ) {
            return false;
        } else {
            return true;
        }
    }

    public static void printTable(String[][] ticTacToe) {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                System.out.print(ticTacToe[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void markNumberX(String numberChosed, String[][] ticTacToe) {
        switch (numberChosed) {
            case "1":
                ticTacToe[0][0] = "X";
                break;
            case "2":
                ticTacToe[0][1] = "X";
                break;
            case "3":
                ticTacToe[0][2] = "X";
                break;
            case "4":
                ticTacToe[1][0] = "X";
                break;
            case "5":
                ticTacToe[1][1] = "X";
                break;
            case "6":
                ticTacToe[1][2] = "X";
                break;
            case "7":
                ticTacToe[2][0] = "X";
                break;
            case "8":
                ticTacToe[2][1] = "X";
                break;
            case "9":
                ticTacToe[2][2] = "X";
                break;
        }
    }

    private static void markNumber0(String numberChosed2, String[][] ticTacToe) {
        switch (numberChosed2) {
            case "1":
                ticTacToe[0][0] = "0";
                break;
            case "2":
                ticTacToe[0][1] = "0";
                break;
            case "3":
                ticTacToe[0][2] = "0";
                break;
            case "4":
                ticTacToe[1][0] = "0";
                break;
            case "5":
                ticTacToe[1][1] = "0";
                break;
            case "6":
                ticTacToe[1][2] = "0";
                break;
            case "7":
                ticTacToe[2][0] = "0";
                break;
            case "8":
                ticTacToe[2][1] = "0";
                break;
            case "9":
                ticTacToe[2][2] = "0";
                break;
        }
    }
}