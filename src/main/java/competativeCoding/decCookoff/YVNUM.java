package competativeCoding.decCookoff;

import java.math.BigInteger;
import java.util.Scanner;

public class YVNUM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {

            long number = scanner.nextLong();
            long temp = number;
            long digits = 0;
            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }
            long finalans = number;
            for (int i = 0; i < digits - 1; i++) {
                long reverse = rightShift(number);
                long factor = (long) Math.pow(10, digits);
                finalans = finalans * factor;
                finalans = finalans + reverse;
                number = reverse;
            }
            finalans = finalans % 1000000007L;
            System.out.println(finalans);

            t--;
        }

    }


    public static long rightShift(long a) {

        long digits = 1;
        long temp = a;
        while (temp != 0) {
            temp = temp / 10;
            digits = digits * 10;
        }
        digits = digits / 10;

        if (digits == 1) {
            return a;
        }
        long remain = a % digits;
        long fac = a / digits;
        remain = remain * 10 + fac;
        return remain;
    }
}
