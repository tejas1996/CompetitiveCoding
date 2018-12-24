package algorithms.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EquilibriumPoint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                integers.add(scanner.nextInt());
            }
            int start = 0;
            int end = n - 1;
            int startSum = integers.get(0);
            int endSum = integers.get(n - 1);
            while (start < end) {
                if (startSum < endSum) {
                    start++;
                    int num = integers.get(start);
                    startSum = startSum + num;
                } else {
                    end--;
                    int num = integers.get(end);
                    endSum = endSum + num;
                }
            }

            if (startSum == endSum) {
                System.out.println(start + 1);
            } else {
                System.out.println("-1");
            }

            t--;
        }


    }
}
