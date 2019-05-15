package algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class CodeForcesB {
    public static void main(String[] args) {

        int[] num = {4, 8, 15, 16, 23, 42};
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Tuple> map = new HashMap<>();
        map.put(32, new Tuple(4, 8));
        map.put(60, new Tuple(4, 15));
        map.put(64, new Tuple(4, 16));
        map.put(92, new Tuple(4, 23));
        map.put(168, new Tuple(4, 42));
        map.put(120, new Tuple(8, 15));
        map.put(128, new Tuple(8, 16));
        map.put(184, new Tuple(8, 23));
        map.put(336, new Tuple(8, 42));
        map.put(240, new Tuple(15, 16));
        map.put(345, new Tuple(15, 23));
        map.put(630, new Tuple(15, 42));
        map.put(368, new Tuple(16, 23));
        map.put(672, new Tuple(16, 42));
        map.put(966, new Tuple(23, 42));

        int[] ans = new int[6];

        System.out.println("? 1 2");
        System.out.flush();
        int ans1 = scanner.nextInt();
        System.out.println("? 2 3");
        System.out.flush();
        int ans2 = scanner.nextInt();
        Tuple one = map.get(ans1);
        Tuple two = map.get(ans2);
        int a = one.x;
        int b = one.y;
        int c = two.x;
        int d = two.y;

        if (a == c || a == d) {
            ans[1] = a;
            ans[0] = b;
            if (a == c) {
                ans[2] = d;
            } else if (a == d) {
                ans[2] = c;
            }
        } else if (b == d || b == c) {
            ans[1] = b;
            ans[0] = a;
            if (b == c) {
                ans[2] = d;
            } else if (a == d) {
                ans[2] = c;
            }
        }


        doITForSecond(map, ans);
        for (int i = 0; i < 6; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static void doITForSecond(HashMap<Integer, Tuple> map, int[] ans) {


        System.out.println("? 4 5");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int ans1 = scanner.nextInt();
        System.out.println("? 5 6");
        System.out.flush();
        int ans2 = scanner.nextInt();
        Tuple one = map.get(ans1);
        Tuple two = map.get(ans2);
        int a = one.x;
        int b = one.y;
        int c = two.x;
        int d = two.y;

        if (a == c || a == d) {
            ans[4] = a;
            ans[3] = b;
            if (a == c) {
                ans[5] = d;
            } else if (a == d) {
                ans[5] = c;
            }
        } else if (b == d || b == c) {
            ans[4] = b;
            ans[3] = a;
            if (b == c) {
                ans[5] = d;
            } else if (a == d) {
                ans[5] = c;
            }
        }

    }


    static class Tuple {
        int x, y;

        public Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
