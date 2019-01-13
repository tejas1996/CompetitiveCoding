package algorithms.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }
            Collections.sort(numbers);
            int sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
            if (sum % 2 == 1) {
                System.out.println("NO");
                t--;
                continue;
            } else {
                sum = sum / 2;
            }
            int dp[][] = new int[numbers.size()][sum + 1];
            for (int i = 0; i < numbers.size(); i++) {
                dp[i][0] = 1;
            }
            for (int i = 0; i < sum; i++) {
                if (i == numbers.get(0)) {
                    dp[0][i] = 1;
                }
            }

            // main dp with memoization
            for (int i = 1; i < numbers.size(); i++) {

                for (int j = 0; j <= sum; j++) {
                    if (j < numbers.get(i)) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        int previous = dp[i - 1][j];
                        int current = dp[i - 1][j - numbers.get(i)];
                        if (previous == 1 || current == 1) {
                            dp[i][j] = 1;
                        }
                    }
                }

            }


            // for getting the actual elements

            ArrayList<Integer> answer = new ArrayList<>();
            int currentx = numbers.size() - 1;
            int currenty = sum;
            while (true) {

                if (currentx == 0 || currenty == 0) {

                    int sumofans = 0;
                    for (int i = 0; i < answer.size(); i++) {
                        sumofans = sumofans + answer.get(i);
                    }
                    if (sumofans != sum) {
                        answer.add(numbers.get(0));
                    }
                    break;
                }
                currentx = currentx - 1;
                int yindex;
                if (currenty - numbers.get(currentx + 1) < 0) {
                    yindex = -1;
                } else {
                    yindex = currenty - numbers.get(currentx + 1);
                }
                if (yindex == -1) {
                    continue;
                }
                if (dp[currentx][yindex] == 1) {
                    answer.add(numbers.get(currentx + 1));
                    currenty = yindex;
                }
            }
            ArrayList<Integer> remaining = new ArrayList<>();
            ArrayList<Integer> dup = new ArrayList<>(answer);
            for (int i = 0; i < numbers.size(); i++) {
                if (!dup.contains(numbers.get(i))) {
                    remaining.add(numbers.get(i));
                } else {
                    dup.remove(numbers.get(i));
                }
            }
            int sumans = 0;
            int sumrem = 0;
            for (int i = 0; i < answer.size(); i++) {
                sumans = sumans + answer.get(i);
            }
            for (int i = 0; i < remaining.size(); i++) {
                sumrem = sumrem + remaining.get(i);
            }

            if (sumans == sumrem) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }


    }
}
