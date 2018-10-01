package competativeCoding;

import java.util.Scanner;

public class MAGICHF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int s = scanner.nextInt();
            int a, b;
            int box = x;
            for (int i = 0; i < s; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                if (a == box) {
                    box = b;
                } else if (b == box) {
                    box = a;
                }
            }

            System.out.println(box);


            t--;
        }


    }
}
