package algorithms.Arrays;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int sum = 0;
            int n = scanner.nextInt();
            for (int i = 0; i < n - 1; i++) {
                int number = scanner.nextInt();
                sum = sum + number;
            }
            int ans = (n * (n + 1)) / 2 - sum;
            System.out.println(ans);
            t--;
        }

    }

}
