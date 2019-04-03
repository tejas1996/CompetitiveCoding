package algorithms.dynamicProgramming;

public class LongestPallindromeSubs {

    public static void main(String[] args) {

        String string = "abbdcacb";
        char[] array = string.toCharArray();
        int ans = findLongestPallin(array, 0, string.length() - 1);
        System.out.println(ans);
    }

    // done by recursion but you can also memoize it to get an optimal solution
    private static int findLongestPallin(char[] array, int start, int end) {

        if (start >= end) {
            return 1;
        } else if (array[start] == array[end]) {
            return 2 + findLongestPallin(array, start + 1, end - 1);
        } else {
            int first, second;
            first = findLongestPallin(array, start + 1, end);
            second = findLongestPallin(array, start, end - 1);
            return Math.max(first, second);
        }

    }
}
