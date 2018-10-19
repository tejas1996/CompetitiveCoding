package competativeCoding.octlong;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class MINDSUM {

    private static int min;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Set<Integer> hashset = new HashSet<>();
        while (t > 0) {

            int n = scanner.nextInt();
            int d = scanner.nextByte();
            Queue<Integer> integers = new LinkedList<>();

            // logic

            int dig = getDigSum(n);
            int val = n + d;

            integers.add(dig);
            integers.add(val);
            while (true) {

                if (integers.isEmpty()) {
                    break;
                }
                int ele = integers.remove();
                int digSum = getDigSum(ele);
                int add = ele + d;

                if (!hashset.contains(digSum)) {
                    hashset.add(digSum);
                    integers.add(digSum);
                }
                if (!hashset.contains(add)) {
                    hashset.add(add);
                    integers.add(add);
                }

            }

            int ans = getMin(hashset);
            System.out.println(ans);

            t--;
        }
    }


    public static int getDigSum(int m) {

        int n, sum = 0;
        while (m > 0) {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        return sum;

    }

    public static int getMin(Set<Integer> hashset) {
        return Collections.min(hashset);

    }
}
