package competativeCoding;

import java.util.Scanner;

public class NAICHEF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, a, b;
        int maxTrack;
        while (t > 0) {
            maxTrack = 0;
            int[] hasharray = new int[10000];
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();
                if (number > maxTrack)
                    maxTrack = number;
                hasharray[number]++;
            }

            double answer = ((double) hasharray[a] / n) * ((double) hasharray[b] / n);
            System.out.println(answer);

            t--;
        }


    }


}
