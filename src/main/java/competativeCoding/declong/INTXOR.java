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

            System.out.println("1 " + "1" + " " + n + " " + n);
            int ans = scanner.nextInt();
            arrayList.add(ans);

            for (int i = 2; i <= n; i++) {

                int number = i - 1;
                System.out.println("1 " + i + " " + number + " " + number);
                    int ans1 = scanner.nextInt();
                arrayList.add(ans1);

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
