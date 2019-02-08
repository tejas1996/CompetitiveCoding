package competativeCoding;

import java.util.Scanner;

public class Codility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = solution(n);

        System.out.println(ans);
    }

    static int solution(int N) {
        // write your code in Java SE 8
        int max = 0;
        int count = 0;
        if (N % 2 == 0) {
            while (N % 2 == 0) {
                N = N / 2;
            }
        }
        while (N > 0) {
            int number = N % 2;
            if (number == 0) {
                count++;
            } else {
                max = count;
                count = 0;
            }
            N = N / 2;
        }
        return max;
    }
}
