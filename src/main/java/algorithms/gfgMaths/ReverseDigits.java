package algorithms.gfgMaths;

import javafx.animation.SequentialTransition;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            String number = scanner.next();
            char[] array = number.toCharArray();
            int n = array.length;
            int i = 0;
            int j = n - 1;
            while (i < j) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            String answer = new String(array);
            long ans = Long.parseLong(answer);
            System.out.println(ans);
            t--;
        }


    }
}
