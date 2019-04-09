package algorithms.strings;

import java.util.regex.Pattern;

public class CheckIP {
    public static void main(String[] args) {
        String input = "155.622.123.125";
        boolean ans = checkIP(input);
        System.out.println(ans);
    }

    private static boolean checkIP(String input) {

        String[] numbers = input.split(Pattern.quote("."));
        if (numbers.length != 4) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            try {
                int num = Integer.parseInt(numbers[i]);
                if (num > 255) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }

        return true;
    }
}
