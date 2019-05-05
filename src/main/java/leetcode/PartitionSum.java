package leetcode;


import java.util.Arrays;

// link to the problem -https://leetcode.com/problems/partition-equal-subset-sum
public class PartitionSum {

    public static void main(String[] args) {

        int[] in = {1, 2, 3, 4, 5, 6, 7};
        boolean ans = partition(in);
        System.out.println(ans);
    }

    private static boolean partition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return isPossible(nums, 0, 0, sum / 2);
    }

    public static boolean isPossible(int[] in, int index, int sum, int goal) {
        if (sum == goal) {
            return true;
        } else if (index >= in.length) {
            return false;
        } else {
            return isPossible(in, index + 1, sum, goal) || isPossible(in, index + 1, sum + in[index], goal);
        }
    }
}
