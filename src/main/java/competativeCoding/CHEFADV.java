package competativeCoding;

import java.util.Scanner;

public class CHEFADV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int a, b;
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            m--;
            n--;
            a = m % x;
            b = n % y;
            if (a == 0 && b == 0) {
                System.out.println("Chefirnemo");
            } else if (a == 1 && b == 1) {
                System.out.println("Chefirnemo");
            } else if (a == 1 && y == 1 && n != 0) {
                System.out.println("Chefirnemo");
            } else if (b == 1 && x == 1 && m != 0) {
                System.out.println("Chefirnemo");
            } else
                System.out.println("Pofik");

            t--;
        }


    }
}
