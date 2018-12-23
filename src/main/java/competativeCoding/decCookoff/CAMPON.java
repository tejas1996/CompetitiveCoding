package competativeCoding.decCookoff;

import java.util.HashMap;
import java.util.Scanner;

public class CAMPON {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            int n = scanner.nextInt();
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i <= 31; i++) {
                hashMap.put(i, 0);
            }
            for (int i = 0; i < n; i++) {
                int date = scanner.nextInt();
                int number = scanner.nextInt();
                for (int j = date; j <= 31; j++) {
                    int ini = hashMap.get(j);
                    hashMap.put(j, ini + number);
                }
            }

            int q = scanner.nextInt();
            for (int i = 0; i < q; i++) {
                int date = scanner.nextInt();
                int need = scanner.nextInt();
                int actual = hashMap.get(date);
                if (actual >= need) {
                    System.out.println("Go Camp");
                } else {
                    System.out.println("Go Sleep");
                }

            }

            t--;
        }


    }
}
