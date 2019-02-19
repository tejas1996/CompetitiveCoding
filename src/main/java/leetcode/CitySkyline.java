package leetcode;

import java.util.Scanner;

public class CitySkyline {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        maxIncreaseKeepingSkyline(grid);


    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {

        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > rowMax[i]) {
                    rowMax[i] = grid[i][j];
                }

                if (grid[i][j] > colMax[j]) {
                    colMax[j] = grid[i][j];
                }
            }
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < rowMax[i] && grid[i][j] < colMax[j]) {
                    count = count + (Math.min(rowMax[i], colMax[j]) - grid[i][j]);
                }
            }
        }

        return count;
    }
}
