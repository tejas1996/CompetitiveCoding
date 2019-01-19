package competativeCoding.janLong;

import java.util.Scanner;

public class DIFNEIGH {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int[][] answer = new int[100][100];
            int n = 0, m = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            if (n == 1 && m == 1) {
                System.out.println("1");
                System.out.println("1");
            } else if (n == 1 && m == 2) {
                System.out.println("1");
                System.out.println("1 1");
            } else if (n == 2 && m == 1) {
                System.out.println("1");
                System.out.println("1");
                System.out.println("1");
            } else if (n == 1 || m == 1) {
                if (m != 1) {
                    boolean isOne = true;
                    for (int i = 0; i < m; i++) {
                        if (isOne) {
                            answer[0][i] = 1;
                            i++;
                            answer[0][i] = 1;
                            isOne = false;
                        } else {
                            answer[0][i] = 2;
                            i++;
                            answer[0][i] = 2;
                            isOne = true;
                        }
                    }
                } else {
                    boolean isOne = true;
                    for (int i = 0; i < n; i++) {
                        if (isOne) {
                            answer[i][0] = 1;
                            i++;
                            answer[i][0] = 1;
                            isOne = false;
                        } else {
                            answer[i][0] = 2;
                            i++;
                            answer[i][0] = 2;
                            isOne = true;
                        }
                    }

                }
                System.out.println("2");
                printGrid(answer, n, m);
            } else if (n == 2 && m == 2) {

                System.out.println("2");
                System.out.println("1 2");
                System.out.println("1 2");
            } else if (n == 2 || m == 2) {

                System.out.println("3");
                if (n == 2) {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            answer[i][j] = (j % 3) + 1;
                        }
                    }
                } else {
                    for (int i = 0; i < n; i++) {
                        answer[i][0] = (i % 3) + 1;
                        answer[i][1] = (i % 3) + 1;
                    }
                }
                printGrid(answer, n, m);

            } else {
                System.out.println("4");

                boolean isOneTwo = true;
                boolean isOneTwoFlipped = false;
                boolean isThreeFlipped = false;
                for (int i = 0; i < n; i++) {
                    if (isOneTwo) {
                        boolean isOne = true;
                        if (isOneTwoFlipped) {
                            isOne = false;
                            isOneTwoFlipped = false;
                        } else {
                            isOne = true;
                            isOneTwoFlipped = true;
                        }
                        for (int u = 0; u < m; u++) {
                            if (isOne) {
                                answer[i][u] = 1;
                                u++;
                                answer[i][u] = 1;
                                isOne = false;
                            } else {
                                answer[i][u] = 2;
                                u++;
                                answer[i][u] = 2;
                                isOne = true;
                            }
                        }
                        isOneTwo = false;
                    } else {
                        boolean isThree = true;
                        if (isThreeFlipped) {
                            isThree = false;
                            isThreeFlipped = false;
                        } else {
                            isThree = true;
                            isThreeFlipped = true;

                        }
                        for (int k = 0; k < m; k++) {
                            if (isThree) {
                                answer[i][k] = 3;
                                k++;
                                answer[i][k] = 3;
                                isThree = false;
                            } else {
                                answer[i][k] = 4;
                                k++;
                                answer[i][k] = 4;
                                isThree = true;
                            }
                        }
                        isOneTwo = true;
                    }
                }
                printGrid(answer, n, m);

            }


            t--;
        }


    }

    private static void printGrid(int[][] answer, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
