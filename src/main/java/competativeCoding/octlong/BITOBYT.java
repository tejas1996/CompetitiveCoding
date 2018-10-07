package competativeCoding.octlong;

import java.util.Scanner;

public class BITOBYT {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            int decider = n % 26;

            if (decider == 0) {
                int fac = n / 26;
                if (fac == 0) {
                    System.out.println("1 0 0");

                } else {
                    long ra;
                    ra = (long) Math.pow(2, fac - 1);
                    System.out.println("0 0 " + ra);
                }

            } else {
                int factor = n / 26;
                long ra = (long) Math.pow(2, factor);


                if (decider > 0 && decider < 3) {
                    System.out.println(ra + " 0 0");
                } else if (decider >= 3 && decider < 11) {

                    System.out.println("0 " + ra + " 0");
                } else {
                    System.out.println("0 0 " + ra);
                }
            }

            t--;
        }


    }
}
