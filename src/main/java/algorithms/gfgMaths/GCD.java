package algorithms.gfgMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int index = (Math.min(a, b)) / 2;
            for (int i = index; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
            t--;
        }


    }
}
