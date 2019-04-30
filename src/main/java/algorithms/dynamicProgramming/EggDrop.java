package algorithms.dynamicProgramming;

import java.util.Scanner;

public class EggDrop {
    static int max = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        eggDrop(n, 0, k);
        System.out.println(max);

    }

    private static int eggDrop(int n, int start, int end) {

        if (n == 1) {
            return (end - start) - 1;
        }

        if (end < start) {
            return n - 1;
        }

        int breakEgg = eggDrop(n - 1, start, (end - start) / 2);
        int notBreak = eggDrop(n, (end - start) / 2 + 1, end);

        if (Math.max(breakEgg, notBreak) > max) {
            max = Math.max(breakEgg, notBreak);
        }
        return Math.max(breakEgg, notBreak);

    }
}
