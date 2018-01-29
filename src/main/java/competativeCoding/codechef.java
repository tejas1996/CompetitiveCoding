package competativeCoding;

import java.util.Scanner;

public class codechef {


    public static void main(String[] args) {

        int t, n, element;
        String day;
        String[] days = {"mon", "tues", "wed", "thurs", "fri", "sat", "sun"};
        int[] number = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of test cases");
        t = sc.nextInt();
        int index;
        // this while loop will run for t number of times where "t" is number of test cases
        while (t != 0) {
            n = sc.nextInt();
            day = sc.next();
            int minimum = n / 7;
            for (int i = 0; i < 7; i++) {
                number[i] = minimum;
            }
            int mod = n % 7;
            for (int i = 0; i < 7; i++) {
                if (days[i].equals(day)) {
                    for (int j = 0; j < mod; j++) {
                        index = i % 7;
                        number[index]++;
                        i++;
                    }

                }

            }

            for (int i = 0; i < 7; i++) {

                System.out.print(number[i]);
            }
            System.out.println("");

            t--;
        }


    }
}
