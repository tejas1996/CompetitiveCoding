package competativeCoding;

import java.util.Scanner;

public class Sort012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] array = new int[100];
        while (t > 0) {

            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int a = 0, b = n - 1, poi = 0;
            while (poi < b) {
                if (array[poi] == 0) {
                    array[poi] = array[a];
                    array[a] = 0;
                    a++;
                    poi++;
                } else if (array[poi] == 2) {
                    array[poi] = array[b];
                    array[b] = 2;
                    b--;
                } else if (array[poi] == 1) {
                    poi++;
                }

            }

            System.out.println();

            t--;
        }

    }

}
