package competativeCoding.declong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class INTXOR {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            ArrayList arrayList = new ArrayList();
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {

                    int number = i + 1;
                    System.out.println("1 " + i + " " + i + " " + number);
                    int ans1 = scanner.nextInt();
                    System.out.println("1 " + i + " " + number + " " + number);
                    int ans0 = scanner.nextInt();
                    arrayList.add(i - 1, ans0);
                    arrayList.add(i, ans1);
                    i++;

                }
            } else {
                for (int i = 1; i < n; i++) {
                    int number = i + 1;
                    System.out.println("1 " + i + " " + i + " " + number);
                    int ans1 = scanner.nextInt();
                    System.out.println("1 " + i + " " + number + " " + number);
                    int ans0 = scanner.nextInt();
                    arrayList.add(i - 1, ans0);
                    arrayList.add(i, ans1);
                    i++;
                }
                System.out.println("1 " + n + " " + n + " " + n);
                int ans = scanner.nextInt();
                arrayList.add(n - 1, ans);

            }


            System.out.print("2 ");
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + " ");
            }
            int result = scanner.nextInt();


            t--;
        }


    }

}
