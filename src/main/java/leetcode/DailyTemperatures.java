package leetcode;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
        doTheJob(input);
    }

    private static void doTheJob(int[] input) {

        Stack<Tuple> integers = new Stack<>();
        int[] ans = new int[30001];
        for (int i = 0; i < input.length; i++) {
            if (integers.isEmpty()) {
                integers.push(new Tuple(input[i], i));
            } else {

                if (input[i] <= integers.peek().number) {
                    integers.push(new Tuple(input[i], i));
                } else {
                    while (!integers.isEmpty() && input[i] > integers.peek().number) {
                        Tuple tup = integers.pop();
                        ans[tup.index] = i - tup.index;
                    }
                    integers.push(new Tuple(input[i], i));
                }


            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    public static class Tuple {

        int number;
        int index;

        public Tuple(int number, int index) {
            this.number = number;
            this.index = index;
        }
    }
}
