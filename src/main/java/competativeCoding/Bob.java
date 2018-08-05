package competativeCoding;

import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            boolean flag = false;
            String first = scanner.next();
            String second = scanner.next();
            char[] ch1 = first.toCharArray();
            char[] ch2 = second.toCharArray();
            if (ch1[0] == 'o' || ch2[0] == 'o') {
                if ((ch1[1] == 'b' || ch2[1] == 'b') && (ch1[2] == 'b' || ch2[2] == 'b')) {
                    flag = true;
                }
            }
            if (ch1[0] == 'b' || ch2[0] == 'b') {
                if ((ch1[1] == 'o' || ch2[1] == 'o') && (ch1[2] == 'b' || ch2[2] == 'b')) {
                    flag = true;
                } else if ((ch1[1] == 'b' || ch2[1] == 'b') && (ch1[2] == 'o' || ch2[2] == 'o')) {
                    flag = true;
                }
            }

            if (flag == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            t--;
        }


    }
}
