package algorithms.dynamicProgramming;

import java.util.Scanner;

public class Stairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = climbStairs(n);
    }

    public static int climbStairs(int n) {

        int[] memory = new int[n + 1];
        memory[0] = 0;
        memory[1] = 1;
        memory[2] = 2;
        for (int i = 2; i <= n; i++) {
            memory[i] = memory[i - 1] + memory[i - 2];
        }

        return memory[n];
    }
}
