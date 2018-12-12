package competativeCoding.declong;

import java.util.Scanner;

public class CHFINTRO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number >= r) {
                System.out.println("Good boi");
            } else {
                System.out.println("Bad boi");
            }
        }


    }

}
