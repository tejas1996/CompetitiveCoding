package algorithms.dynamicProgramming;

public class LongestCommonSubseqBetter {
    public static void main(String[] args) {

        String first = "abcsanca";
        String second = "aanca";

        int n = first.length();
        int m = second.length();

        int dp[][] = new int[100][100];

        for (int i = 0; i < m; i++) {
            dp[m][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            dp[0][n] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (second.charAt(i - 1) == first.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[m][n]);


    }
}
