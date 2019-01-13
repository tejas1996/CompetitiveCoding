package algorithms.dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            ArrayList<Integer> coins = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                coins.add(scanner.nextInt());
            }
            int weight = scanner.nextInt();
            int[][] dp = new int[n][weight + 1];
            for (int i = 0; i < coins.size(); i++) {
                dp[i][0] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= weight; j++) {
                    if (j < coins.get(i)) {
                        if (i == 0) {
                            dp[i][j] = 0;

                        } else {
                            dp[i][j] = dp[i - 1][j];
                        }
                    } else {
                        int previous = 0;
                        if (i > 0) {
                            previous = dp[i - 1][j];
                        }
                        int current = 0;
                        current = dp[i][j - coins.get(i)];
                        dp[i][j] = previous + current;

                    }
                }

            }
            System.out.println(dp[coins.size() - 1][weight]);

            t--;
        }


    }
}
