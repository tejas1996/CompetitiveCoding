package leetcode;

import java.util.PriorityQueue;
import java.util.Scanner;

// Problem link - https://leetcode.com/problems/palindromic-substrings/submissions/

public class FindAllPallindrome {
    public static void main(String[] args) {

        PriorityQueue<Integer> integers = new PriorityQueue<>(5);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int ans = countPallindrome(input);
        System.out.println(ans);
    }

    private static int countPallindrome(String input) {
        char[] array = input.toCharArray();

        int count = 1;
        for (int i = 1; i < array.length; i++) {
            int left = i - 1;
            int right = i + 1;
            count++;
            while (left >= 0 && right < array.length && array[left] == array[right]) {
                count++;
                left--;
                right++;
            }
        }

        for (int i = 1; i < array.length; i++) {
            int left = i - 1;
            int right = i;
            while (left >= 0 && right < array.length && array[left] == array[right]) {
                count++;
                left--;
                right++;
            }

        }
        return count;
    }
}
