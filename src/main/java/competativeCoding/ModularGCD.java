package competativeCoding;

import java.util.Scanner;

public class ModularGCD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextInt();
        double a, b, n;
        while (t != 0) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            n = scanner.nextDouble();
            double re = gcd((Math.pow(a, n) + Math.pow(b, n)), Math.abs(a - b));
            re = re % 1000000007;
            System.out.println((int) re);
            t--;
        }

    }

    public static double gcd(double n1, double n2) {
        if (n1 == 0) {
            return n2;
        }
        if (n2 == 0) {
            return n1;
        }
        double gcd = 1;
        for (double i = 1; i <= n1 / 2 && i <= n2 / 2; ++i) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

}
