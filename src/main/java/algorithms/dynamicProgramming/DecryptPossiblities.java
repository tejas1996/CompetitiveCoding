package algorithms.dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class DecryptPossiblities {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                integers.add(scanner.nextInt());
            }
            int[] odd = new int[100];
            odd[0] = 1;

            if (integers.get(0) == 1 || (integers.get(0) == 2 && integers.get(1) < 7)) {
                odd[1] = 2;
            }
            for (int i = 2; i < n; i++) {
                if (integers.get(i - 1) == 1 || (integers.get(i - 1) == 2 && integers.get(i) < 7)) {
                    odd[i] = odd[i - 2] + odd[i - 1];
                } else {
                    odd[i] = odd[i - 1];
                }

            }

            System.out.println(odd[n - 1]);


            /*


            1 2 1 2 1 2 1  2
            0 1 1 2 2 3
                      8




            1 2 3 - 7
            1 2 - 3
            11



             */

            t--;
        }


    }
}
