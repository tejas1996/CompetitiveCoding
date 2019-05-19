package algorithms;

import java.util.*;

public class Hotstar {
    public static void main(String[] args) {

        int[] test = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 14, 16, 16, 16, 16, 16, 16, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20};
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < test.length; i++) {
            integers.add(test[i]);
        }
        droppedRequests(integers);
    }

    static int droppedRequests(List<Integer> requestTime) {
        int max = 0;
        int n = requestTime.size();
        HashMap<Integer, Integer> hash = new HashMap();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!hash.containsKey(requestTime.get(i))) {
                hash.put(requestTime.get(i), 1);
                if (requestTime.get(i) > max) {
                    max = requestTime.get(i);
                }
            } else {
                int temp = hash.get(requestTime.get(i));
                if (temp >= 3) {
                    count++;
                }
                hash.put(requestTime.get(i), temp + 1);
            }
        }

        int sumOfTen = 0;
        int sumOfMinute = 0;
        for (int i = 1; i <= 10; i++) {
            if (hash.containsKey(i)) {
                sumOfTen += hash.get(i);
//                System.out.println(sumOfTen);
            }
        }
        if (sumOfTen > 20) {
            count += sumOfTen - 20;
        }

        HashMap<Integer, Integer> pre = new HashMap<>();

        pre.put(10, sumOfTen);

        for (int i = 11; i <= max; i++) {
//            System.out.println(sumOfTen);
            int an = 0;

            if (hash.containsKey(i - 10)) {
                an = pre.get(i - 1);
                sumOfTen -= hash.get(i - 10);
            }

            if (hash.containsKey(i)) {
                sumOfTen += hash.get(i);
            }
            System.out.println(sumOfTen - an);
            if (sumOfTen > 20) {
                count += sumOfTen - 20;
            }
            pre.put(i, sumOfTen);

        }
//        System.out.println(sumOfTen);


        for (int i = 1; i <= 60; i++) {
            if (hash.containsKey(i)) {
                sumOfMinute += hash.get(i);
            }
        }
        if (sumOfMinute > 60) {
            count += sumOfMinute - 60;
        }

        for (int i = 61; i <= max; i++) {
            if (hash.containsKey(i - 60)) {
                sumOfMinute -= hash.get(i - 60);
            }

            if (hash.containsKey(i)) {
                sumOfMinute += hash.get(i);
            }
            if (sumOfMinute > 60) {
                count += sumOfMinute - 60;
            }

        }


        return count;
    }
}
