package competativeCoding.octlong;

import java.util.Scanner;

public class CLORGIRD2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            char[][] grid = new char[1005][1005];
            char[][] grid2 = new char[1005][1005];
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int flag = 0;

            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                String test = scanner.nextLine();
                for (int j = 0; j < m; j++) {
                    char text = test.charAt(j);
                    grid[i][j] = text;
                    if (text == '#') {
                        grid2[i][j] = '#';
                    } else if (i > 0 && j > 0) {
                        if (grid[i][j - 1] == '.' && grid[i - 1][j] == '.' && grid[i - 1][j - 1] == '.') {
                            grid2[i][j - 1] = '#';
                            grid2[i - 1][j] = '#';
                            grid2[i - 1][j - 1] = '#';
                            grid2[i][j] = '#';
                        }

                    }

                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid2[i][j] != '#') {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }


    }

}
