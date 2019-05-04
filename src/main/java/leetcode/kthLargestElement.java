package leetcode;

import java.util.PriorityQueue;

public class kthLargestElement {
    public static void main(String[] args) {

        int[] in = {9, 2, 4, 7, 3};
        int k = 3;
        int ans = findKSmalledt(in, k);
        System.out.println(ans);
    }

    private static int findKSmalledt(int[] in, int k) {

        PriorityQueue<Integer> integers = new PriorityQueue<>();
        for (int i = 0; i < in.length; i++) {
            integers.add(in[i]);
            if (integers.size() > k) {
                integers.poll();
            }
        }


        return integers.poll();
    }
}
