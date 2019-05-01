package leetcode;

import java.util.Scanner;

public class countingBits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = countBits(n);
        for (int i = 0; i < n + 1; i++) {
            System.out.println(ans[i] + " ");
        }


    }

    private static int[] countBits(int n) {
        int ans[] = new int[100];
        if (n == 0) {
            ans[0] = 0;
            return ans;
        } else if (n == 1) {
            ans[0] = 0;
            ans[1] = 1;
            return ans;
        }
        ans[0] = 0;
        ans[1] = 1;
        int count = 2;
        int[] last = new int[100];
        last[0] = 1;

        int lenght = 1;
        while (count < n + 1) {
            int[] newLast = new int[100];
            int newCount = 0;
            for (int i = 0; i < lenght; i++) {
                ans[count] = last[i];
                newLast[newCount] = last[i];
                newCount++;
                count++;
                ans[count] = last[i] + 1;
                newLast[newCount] = last[i] + 1;
                count++;
                newCount++;
            }
            lenght = newCount;
            last = newLast;
        }
        return ans;
    }
}
