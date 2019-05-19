package competativeCoding.maycook;

import java.util.Scanner;

public class RECVSEQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            boolean flag = true;
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            long diff1 = arr[1] - arr[0];
            long diff2 = arr[2] - arr[1];
            long diff3 = arr[3] - arr[2];
            long finalDiff = 0;
            if (diff1 == diff2 || diff1 == diff3) {
                finalDiff = diff1;
            } else {
                if (diff2 == diff3) {
                    finalDiff = diff2;
                    arr[0] = arr[1] - finalDiff;
                    flag = false;
                } else {
                    diff1 = arr[1] - arr[0];
                    diff2 = arr[2] - arr[0];
                    diff3 = arr[3] - arr[0];
                    if (diff1 == diff2 / 2 || diff1 == diff3 / 3) {
                        finalDiff = diff1;
                    } else {
                        finalDiff = arr[3] - arr[2];
                    }

                }

            }
            if (flag) {

                for (int i = 1; i < n; i++) {
                    if ((arr[i] - arr[i - 1]) != finalDiff) {
                        arr[i] = arr[i - 1] + finalDiff;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }
            System.out.println();

            t--;
        }
    }
}
