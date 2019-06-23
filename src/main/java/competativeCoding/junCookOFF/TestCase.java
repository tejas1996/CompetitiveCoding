package competativeCoding.junCookOFF;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int score = 0;
            int n = scanner.nextInt();
            String correct = scanner.next();
            String chef = scanner.next();
            int pt = 0;
            while (pt < n) {
                if (correct.charAt(pt) == chef.charAt(pt)) {
                    score++;
                    pt++;
                } else if (chef.charAt(pt) == 'N') {
                    pt++;
                } else {
                    pt = pt + 2;
                }
            }

            System.out.println(score);

            t--;
        }
    }
}
