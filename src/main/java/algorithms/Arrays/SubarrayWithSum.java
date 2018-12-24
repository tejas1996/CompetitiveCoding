package algorithms.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithSum {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                integers.add(number);
            }
            int currsum = integers.get(0);
            int start = 0, end = 0;

            boolean flag = true;

            while (currsum != sum) {
                if (end + 1 == integers.size() && start + 1 == integers.size()) {
                    System.out.println("-1");
                    flag = false;
                    break;

                } else {
                    if (currsum < sum && end + 1 < integers.size()) {
                        end++;
                        int num = integers.get(end);
                        currsum = currsum + num;
                    } else {
                        int num = integers.get(start);
                        currsum = currsum - num;
                        start++;
                    }
                }
            }
            if (flag == true) {
                start++;
                end++;
                System.out.println(" the answer is " + start + " " + end);
            }

            t--;
        }


    }
}
