package competativeCoding.jancook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ADAKNG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Integer> numbers = Arrays.asList(3, 4);
        while (t > 0) {

            int a, b, k;
            a = scanner.nextInt();
            b = scanner.nextInt();
            k = scanner.nextInt();

            int count = 0;
            int newRowNeg = a - k;
            int newRowPos = a + k;
            int newColNeg = b - k;
            int newColPos = b + k;

            for (int i = newRowNeg; i <= newRowPos; i++) {
                for (int j = newColNeg; j <= newColPos; j++) {

                    if (i <= 0 || j <= 0 || i > 8 || j > 8) {

                    } else {
                        count++;
                    }
                }
            }

            System.out.println(count);
            t--;
        }


    }
}
