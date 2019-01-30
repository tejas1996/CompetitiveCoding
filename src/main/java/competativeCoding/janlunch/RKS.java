package competativeCoding.janlunch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RKS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n, k;
            n = scanner.nextInt();
            k = scanner.nextInt();
            HashSet<Integer> rows = new HashSet<>();
            HashSet<Integer> coloums = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                rows.add(i);
                coloums.add(i);
            }
            int row, coloum;
            for (int i = 0; i < k; i++) {
                row = scanner.nextInt();
                coloum = scanner.nextInt();
                rows.remove(row);
                coloums.remove(coloum);
            }
            System.out.print(n - k + " ");
            Iterator value = rows.iterator();
            Iterator bolvalue = coloums.iterator();
            while (value.hasNext()) {
                System.out.print(value.next() + " ");
                System.out.print(bolvalue.next() + " ");

            }
            System.out.println("");
            t--;
        }

    }
}
