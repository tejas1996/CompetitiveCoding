package competativeCoding.janlunch;

import java.util.Scanner;

public class WTCH {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            String string = scanner.next();
            char[] array = string.toCharArray();
            int answer = 0;
            if (n == 1) {
                if (array[0] == '0') {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
                t--;
                continue;
            }
            if (array[0] == '0' && array[1] == '0') {
                array[0] = '1';
                answer++;
            }

            if (array[n - 1] == '0' && array[n - 2] == '0') {
                array[n - 1] = '1';
                answer++;
            }

            for (int i = 0; i < n; i++) {
                int count = 0;
                if (array[i] == '0') {
                    count++;
                    i++;
                    if (i != n) {
                        while (array[i] == '0') {
                            i++;
                            count++;
                            if (i == n - 1) {
                                break;
                            }
                        }
                    }

                    if (count >= 3) {
                        int factor = 0;
                        if (count % 2 == 0) {
                            factor = count / 2 - 1;
                        } else {
                            factor = count / 2;
                        }
                        answer = answer + factor;
                    }

                }
            }

            System.out.println(answer);

            t--;
        }


    }
}
