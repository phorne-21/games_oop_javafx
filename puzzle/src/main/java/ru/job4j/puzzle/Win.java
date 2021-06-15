package ru.job4j.puzzle;

public class Win {
    public static boolean monoHoriz(int[][] board, int number) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[number][i] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVert(int[][] board, int number) {
        boolean result = true;
        for (int[] ints : board) {
            if (ints[number] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (Win.monoHoriz(board, i) || Win.monoVert(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
