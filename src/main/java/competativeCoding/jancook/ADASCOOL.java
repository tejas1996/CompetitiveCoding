package competativeCoding.jancook;

import java.util.Scanner;

public class ADASCOOL {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n, m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            if (n % 2 == 0 || m % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }


    }
}
