package algorithms.stack;

import java.util.Stack;

public class CheckDuplicateParanthesis {
    public static void main(String[] args) {
        String input = "((x+y))+ y";
        boolean ans = checkForDuplicateParanthesis(input);
        System.out.println(ans);
    }

    private static boolean checkForDuplicateParanthesis(String input) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != ')' && input.charAt(i) != ']' && input.charAt(i) != '}') {
                stack.push(input.charAt(i));
            } else {
                if (input.charAt(i) == ')') {
                    if (stack.pop() == '(') {
                        return false;
                    }
                    while (stack.pop() != '(') {

                    }
                }
                if (input.charAt(i) == ']') {
                    if (stack.pop() == '[') {
                        return false;
                    }
                    while (stack.pop() != '[') ;
                }
                if (input.charAt(i) == '}') {
                    if (stack.pop() == '{') {
                        return false;
                    }
                    while (stack.pop() != '{') ;
                }
            }
        }

        return true;
    }
}
