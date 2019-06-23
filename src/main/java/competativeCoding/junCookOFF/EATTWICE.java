package competativeCoding.junCookOFF;

import java.util.HashMap;
import java.util.Scanner;

public class EATTWICE {

    public static void main(String[] args) {


        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t > 0) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int day = scanner.nextInt();
                int taste = scanner.nextInt();
                if (hash.containsKey(day)) {
                    int tas = hash.get(day);
                    if (taste > tas) {
                        hash.put(day, taste);
                    }
                } else {
                    hash.put(day, taste);
                }
            }

            int gre = 0, sigree = 0;

            for (int i = 0; i < m; i++) {
                if (hash.containsKey(i)) {
                    if (hash.get(i) > gre) {
                        sigree = gre;
                        gre = hash.get(i);
                    } else if (hash.get(i) > sigree) {
                        sigree = hash.get(i);
                    }
                }
            }

            System.out.println(gre + sigree);

            t--;
        }
    }
}
