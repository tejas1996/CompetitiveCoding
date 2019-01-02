package algorithms.dynamicProgramming;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSubs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }
            ArrayList<Integer> index = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int num = numbers.get(i);
                int maxIndex = 0;
                for (int j = 0; j < i; j++) {
                    if (numbers.get(j) < num && index.get(j) > maxIndex) {
                        maxIndex = index.get(j);
                    }
                }
                if (maxIndex == 0) {
                    index.add(i, 1);
                } else {
                    index.add(i, maxIndex + 1);
                }
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (index.get(i) > ans) {
                    ans = index.get(i);
                }

            }
            System.out.println(ans);

            t--;
        }
    }


}
