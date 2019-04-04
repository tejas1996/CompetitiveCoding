package algorithms.dynamicProgramming;

public class LongestBitonicSubsequence {
    public static void main(String[] args) {

        int[] numbers = {80, 60, 30, 40, 20, 10};
        int[] lis = new int[numbers.length];
        int[] dis = new int[numbers.length];

        lis[0] = 1;
        for (int i = 1; i < numbers.length; i++) {
            int max = 0;
            for (int j = i; j >= 0; j--) {
                if (numbers[j] < numbers[i] && lis[j] > max) {
                    max = lis[j];
                }
                lis[i] = 1 + max;
            }
        }
        dis[numbers.length - 1] = 1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            int max = 0;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[i] && dis[j] > max) {
                    max = dis[j];
                }
                dis[i] = 1 + max;
            }
        }

        int ans = 0;
        for (int i = 0; i < numbers.length; i++) {
            ans = Math.max(ans, lis[i] + dis[i]);
        }
        System.out.println(ans - 1);
    }
}
