package leetcode;

// link to the problem - https://leetcode.com/problems/combination-sum/

import java.util.Arrays;

public class CombinationSum {
    public static void main(String[] args) {

        int[] cand = {2, 3, 5};
        int sum = 8;
        combinationSum(cand, sum);
    }

    private static void combinationSum(int[] cand, int sum) {
        Arrays.sort(cand);
        int[][] dp = new int[cand.length + 1][sum + 1];

        for (int i = 0; i <= sum; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= cand.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= cand.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < i) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    if (j - cand[i - 1] >= 0) {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - cand[i - 1]];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        System.out.println(dp[cand.length][sum]);
    }
}
