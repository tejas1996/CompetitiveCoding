package algorithms.strings;

public class LongestPallidromeBetter {
    public static void main(String[] args) {

        String input = "rabbbar";
        int result = checkPallidrome(input);
        System.out.println(result);
    }

    private static int checkPallidrome(String input) {

        int max = 0;
        char[] array = input.toCharArray();
        int n = input.length();
        for (int i = 1; i < n - 1; i++) {
            int a = i - 1;
            int b = i + 1;
            int count = 1;
            while (a >= 0 && b < n && array[a] == array[b]) {
                count = count + 2;
                a--;
                b++;
            }
            if (count > max) {
                max = count;
            }

            if (i + 2 < n && array[i] == array[i + 1]) {
                a = i - 1;
                b = i + 2;
                count = 2;
                while (a >= 0 && b < n && array[a] == array[b]) {
                    count = count + 2;
                    a--;
                    b++;
                }
                if (count > max) {
                    max = count;
                }

            }

        }
        return max;
    }
}
