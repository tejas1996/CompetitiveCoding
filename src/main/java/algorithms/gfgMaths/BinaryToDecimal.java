package algorithms.gfgMaths;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            String binary = scanner.next();
            int ans = Integer.parseInt(binary, 2);
            System.out.println(ans);

            t--;
        }

    }

}
