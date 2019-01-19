package competativeCoding.janLong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HP18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n, a, b;
            ArrayList<Integer> common = new ArrayList<>();
            ArrayList<Integer> bob = new ArrayList<>();
            ArrayList<Integer> alice = new ArrayList<>();
            n = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                if (number % a == 0 && number % b == 0) {
                    common.add(number);
                } else if (number % a == 0) {
                    bob.add(number);
                } else if (number % b == 0) {
                    alice.add(number);
                }
            }
            boolean turn = true;
            while (true) {
                if (turn) {
                    if (!common.isEmpty()) {
                        common = new ArrayList<>();
                    } else if (!bob.isEmpty()) {
                        bob.remove(bob.size() - 1);
                    } else {
                        break;
                    }
                    turn = false;
                } else {

                    if (!common.isEmpty()) {
                        common = new ArrayList<>();
                    } else if (!alice.isEmpty()) {
                        alice.remove(alice.size() - 1);
                    } else {
                        break;
                    }
                    turn = true;
                }

            }
            if (turn == true) {
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }

            t--;
        }


    }
}
