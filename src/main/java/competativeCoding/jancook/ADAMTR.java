package competativeCoding.jancook;

import java.util.Scanner;

public class ADAMTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            int[][] first = new int[1024][1024];
            int[][] second = new int[1024][1024];

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    first[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    second[i][j] = scanner.nextInt();
                    if (flag == true && j > i) {
                        if (first[i][j] == second[i][j] || second[i][j] == first[j][i]) {

                        } else {
                            flag = false;

                        }

                    }
                }
            }


            if (flag == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


            t--;
        }


    }
}
