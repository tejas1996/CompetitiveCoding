package leetcode;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] in = {1, 3, 4, 5, 2, 3};
        findDuplicate(in);
    }

    public static int findDuplicate(int[] nums) {
        int t = nums[0];
        int h = nums[0];
        do {
            t = nums[t];
            h = nums[nums[h]];
        } while (t != h);
        return nums[t];
    }
}
