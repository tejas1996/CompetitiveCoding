package competativeCoding.declong;

import java.util.Scanner;

public class MAXEP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        boolean flag = false;
        int number = (n + 1) / 2;
        int factor = number / 2;
        System.out.println("1 " + number);
        int result = scanner.nextInt();
        int previous = 0;
        while (flag == false) {

            if (result == 1) {
                number = number - factor - 1;
                System.out.println("2");
                System.out.println("1 " + number);
                previous = 1;
            } else if (result == 0) {
                number = number + factor + 1;
                System.out.println("1 " + number);
                previous = -1;
            } else {
                if (previous == 1) {
                    number = number + factor + 1;
                    System.out.println("1 " + number);

                } else {
                    number = number - factor - 1;
                    System.out.println("2");
                    System.out.println("1 " + number);
                }
            }
            result = scanner.nextInt();
            factor = factor / 2;
            if (factor == 0 && result != -1) {

                if (result == 0) {
                    int safe = number + 1;
                    System.out.println("1 " + safe);
                    result = scanner.nextInt();
                    if (result == 1) {
                        int ans = number + 1;
                        System.out.println("3 " + ans);
                    } else {
                        int ans = number + 2;
                        System.out.println("3 " + ans);

                    }
                } else {
                    System.out.println("2");
                    if (number == 1) {
                        System.out.println("3 1");
                        break;
                    }
                    if (number == n) {
                        System.out.println("3 " + n);
                        break;
                    }
                    int safe = number - 1;
                    System.out.println("1 " + safe);
                    result = scanner.nextInt();
                    if (result == 0) {
                        System.out.println("3 " + number);
                    } else {
                        System.out.println("2");
                        int ans = number - 1;
                        System.out.println("3 " + ans);
                    }
                }
                flag = true;
            }

        }


    }
}
