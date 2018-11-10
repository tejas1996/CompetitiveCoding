package competativeCoding.novlong;

import java.util.HashMap;
import java.util.Scanner;

public class PRDRG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            boolean flag = false;
            int n = scanner.nextInt();
            long num = 0, denim;
            denim = (long) Math.pow(2, n);
            for (int i = 0; i < n; i++) {
                if (flag == false) {
                    num = num * 2 + 1;
                    flag = true;
                } else {
                    num = num * 2 - 1;
                    flag = false;
                }
            }

            System.out.println(num + " " + denim + " ");
            t--;
        }
    }

}
