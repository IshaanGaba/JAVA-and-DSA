
import java.io.*;
import java.util.*;

public class spaceshipbomb {
    public static int ans;

    public static void check(int[][] b, int row, int col, boolean bomb, int isSafe, int coins) {
        // Base case: Out of bounds or top row
        if (row < 0 || col < 0 || col >= 5) {
            ans = Math.max(ans, coins);
            return;
        }

        // If the cell is 0 or 1
        if (b[row][col] == 0 || b[row][col] == 1) {
            int newCoins = coins;
            if (b[row][col] == 1) {
                newCoins++; // Collect coin
            }
            // Decrease isSafe counter if a bomb is active
            if (bomb) {
                isSafe--;
            }
            // If isSafe becomes invalid, terminate the path
            if (isSafe < 0) {
                return;
            }
            // Recursive calls to move to the next rows
            check(b, row - 1, col, bomb, isSafe, newCoins);
            check(b, row - 1, col - 1, bomb, isSafe, newCoins);
            check(b, row - 1, col + 1, bomb, isSafe, newCoins);
        } else if (b[row][col] == 2) { // If the cell is a bomb
            if (bomb && isSafe > 0) {
                // Bomb is already active, decrease isSafe
                isSafe--;
                check(b, row - 1, col, bomb, isSafe, coins);
                check(b, row - 1, col - 1, bomb, isSafe, coins);
                check(b, row - 1, col + 1, bomb, isSafe, coins);
            } else if (bomb && isSafe == 0) {
                // Bomb explodes, terminate this path
                ans = Math.max(ans, coins);
                return;
            } else {
                // Activate the bomb and reset isSafe counter
                bomb = true;
                isSafe = 4;
                check(b, row - 1, col, bomb, isSafe, coins);
                check(b, row - 1, col - 1, bomb, isSafe, coins);
                check(b, row - 1, col + 1, bomb, isSafe, coins);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // Number of rows
        int[][] board = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        ans = Integer.MIN_VALUE; // Reset the global max
        // Start from the bottom row and middle columns
        check(board, n - 1, 1, false, 0, 0);
        check(board, n - 1, 2, false, 0, 0);
        check(board, n - 1, 3, false, 0, 0);

        System.out.println("Max_coins : " + ans);
    }
}


