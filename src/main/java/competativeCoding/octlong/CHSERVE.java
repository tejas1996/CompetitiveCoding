package competativeCoding.octlong;

import java.util.Scanner;

public class CHSERVE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = scanner.nextInt();

            int sum = a + b;

            if ((sum / k) % 2 == 1) {
                System.out.println("COOK");
            } else {
                System.out.println("CHEF");
            }


            t--;
        }


    }


}
