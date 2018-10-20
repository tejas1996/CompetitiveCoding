package competativeCoding.octlong;

import java.util.Scanner;

public class HMAPPY {

    public static void main(String[] args) {


        // i am half asleep so pls neglect the code and silly things, it works though.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] ballons = new int[100];
        int[] candies = new int[100];
        int[] mul = new int[100];

        for (int i = 0; i < n; i++) {
            ballons[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            mul[i] = ballons[i] * candies[i];
        }

        for (int i = 0; i < c; i++) {

            int max = mul[0];

            for (int j = 0; j < n; j++) {
                if (mul[j] > max) {
                    max = mul[j];
                }
            }

            for (int j = 0; j < n; j++) {
                if (mul[j] == max) {
                    mul[j] = mul[j] - candies[j];
                    break;
                }
            }


        }

        int ans = mul[0];
        for (int j = 0; j < n; j++) {
            if (mul[j] > ans) {
                ans = mul[j];
            }
        }

        System.out.println(ans);


    }

}
