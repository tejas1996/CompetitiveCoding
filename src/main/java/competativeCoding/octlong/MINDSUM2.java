package competativeCoding.octlong;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class MINDSUM2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {

            HashSet<Integer> integers = new HashSet<>();
            int n = scanner.nextInt();
            int d = scanner.nextByte();
            int count = 0;
            int sin = n;
            while (true) {

                while ((sin / 10) != 0) {
                    sin = getDigSum(sin);
//                    count--;
                }
                if (!integers.contains(sin)) {
//                    count++;
                    integers.add(sin);
//                    count++;
                    sin = sin + d;
                } else {
                    break;
                }

            }

            int ans = Collections.min(integers);

//            System.out.println("hey");


            Queue<Sweet> integers2 = new LinkedList<>();
            HashMap<Integer, Integer> hashset = new HashMap<>();

            int dig = getDigSum(n);
            int val = n + d;

            int remem;
            integers2.add(new Sweet(dig, 1));
            integers2.add(new Sweet(val, 1));
            while (true) {


                Sweet ele = integers2.remove();
                if (ans == ele.num) {
                    break;
                }
                count++;
                int digSum = getDigSum(ele.num);
                int add = ele.num + d;

                if (!hashset.containsKey(digSum)) {
                    hashset.put(digSum, ele.remem + 1);
                    integers2.add(new Sweet(digSum, ele.remem + 1));
                }
                if (!hashset.containsKey(add)) {
                    hashset.put(add, ele.remem + 1);
                    integers2.add(new Sweet(add, ele.remem + 1));
                }

            }

            System.out.println(ans + " " + hashset.get(ans));

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

}
