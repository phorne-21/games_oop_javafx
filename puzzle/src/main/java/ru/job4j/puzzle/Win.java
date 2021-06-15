package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        int i = 0;
        while (i < board.length) {
            if (board[i][i] == 1) {
                result = true;
                for (int[] ints : board) {
                    if (ints[i] == 0) {
                        for (int cell = 0; cell < board.length; cell++) {
                            if (board[i][cell] == 0) {
                                result = false;
                                break;
                            }
                        }
                    }
                    break;
                }
            }
            if (result) {
                break;
            } else {
                i++;
            }
        }
        return result;
    }
}
