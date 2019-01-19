package competativeCoding.janLong;

import java.util.*;

public class DPAIRS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int minIndex = 0, maxIndex = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            int n = scanner.nextInt();
            if (n < min) {
                min = n;
                minIndex = i;
            }
        }
        for (int i = 0; i < b; i++) {
            int m = scanner.nextInt();
            if (m > max) {
                max = m;
                maxIndex = i;
            }
        }

        int count = 0;

        for (int i = 0; i < b && count <= (a + b - 1); i++) {
//            result.add(new Pair(minIndex,i));
            if (i != maxIndex) {
                System.out.println(minIndex + " " + i);
            }

        }
        for (int i = 0; i < a && count <= (a + b - 1); i++) {
//           result.add(new Pair(i,maxIndex));\
            if (i != minIndex) {
                System.out.println(i + " " + maxIndex);
            }

        }


        if (count < a + b - 1) {
            System.out.println(minIndex + " " + maxIndex);
        }

    }
}
