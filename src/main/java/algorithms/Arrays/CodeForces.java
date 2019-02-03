package algorithms.Arrays;

import java.util.*;

class CodeForces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {

            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            if (l1 != l2) {
                int ans = l2;
                System.out.print(l1 + " " + ans);

            } else if (l1 == l2 && r1 == r2) {
                System.out.print(l1 + " " + r2);
            } else if (l1 == l2) {
                System.out.print(l1 + " " + r2);
            } else {
                System.out.print(l1 + " " + l2);
            }
            System.out.println();


            t--;
        }

    }


}