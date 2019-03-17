package algorithms.gfgMaths;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int number = scanner.nextInt();
            int unit = 0, tens = 0, hundreds = 0, orignal = 0;
            orignal = number;
            unit = number % 10;
            number = number / 10;
            tens = number % 10;
            hundreds = number / 10;
            if (Math.pow(unit, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3) == orignal) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


            t--;
        }


    }
}
