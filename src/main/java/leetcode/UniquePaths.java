package leetcode;

public class UniquePaths {
    public static void main(String[] args) {

        int ans = uniquePaths(19, 13);
        System.out.println(ans);

    }

    public static int uniquePaths(int m, int n) {

        int a = n - 1;
        int b = m - 1;
        return (int) binomialCoeff(a + b, b);

    }

    private static int binomialCoeff(int n, int k) {
        int C[] = new int[k + 1];

        C[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                C[j] = C[j] + C[j - 1];
            }
        }
        return C[k];
    }
}
