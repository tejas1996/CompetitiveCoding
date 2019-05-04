package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    static List<String> strings = new ArrayList<>();

    public static void main(String[] args) {

        int n = 1;
        generateParenthesesForN(n, n, 0, "");
    }

    private static void generateParenthesesForN(int opning, int closing, int open, String current) {

        if (opning == 0 && closing == 0 && open == 0) {
            System.out.println(current);
            strings.add(current);
            return;
        }
        if (open == 0) {
            if (opning > 0) {
                current += "(";
                generateParenthesesForN(opning - 1, closing, open + 1, current);
            } else {
                return;
            }
        } else {
            if (opning > 0) {
                generateParenthesesForN(opning - 1, closing, open + 1, current + "(");
            }
            if (closing > 0) {
                generateParenthesesForN(opning, closing - 1, open - 1, current + ")");
            }
        }
        return;
    }
}
