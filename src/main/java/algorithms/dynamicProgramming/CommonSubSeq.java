package algorithms.dynamicProgramming;

public class CommonSubSeq {

    public static void main(String[] args) {

        String first = "tejasdondisgreat";
        String sec = "teiisigreat";

        int ans = findLongestSeq(first, sec);
        System.out.println(ans);
    }

    private static int findLongestSeq(String first, String sec) {

        int[][] dp = new int[100][100];
        int n = first.length();
        int m = sec.length();

        for (int i = 0; i < n; i++) {
            dp[0][i] = 0;
            dp[i][0] = 0;
        }   

        int max = 0;

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (first.charAt(j - 1) == sec.charAt(i - 1)) {
                    if (i == 1 || j == 1) {
                        dp[i - 1][j - 1] = 1;
                    } else {
                        dp[i - 1][j - 1] = 1 + dp[i - 2][j - 2];
                    }
                } else {
                    if (i == 1 || j == 1) {
                        if (i == 1 && j == 1) {
                            dp[i - 1][j - 1] = 0;
                        } else if (i == 1) {
                            dp[i - 1][j - 1] = dp[i - 1][j - 2];
                        } else {
                            dp[i - 1][j - 1] = dp[i - 2][j - 1];
                        }
                    } else {
                        dp[i - 1][j - 1] = Math.max(dp[i - 2][j - 1], dp[i - 1][j - 2]);
                    }

                }
                if (dp[i - 1][j - 1] > max) {
                    max = dp[i - 1][j - 1];
                }

            }

        }

        return max;


    }

}
