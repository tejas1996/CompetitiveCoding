package competativeCoding.octlong;

import java.util.Scanner;

public class THREEFR {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b == c || a + c == b || c + b == a) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }


            t--;
        }


    }
}