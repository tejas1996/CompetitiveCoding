package algorithms.stack;

import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {

        String input = "[[]]]]}({})";
        boolean ans = checkParanthesis(input);
        System.out.println(ans);
    }

    private static boolean checkParanthesis(String input) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
                stack.push(input.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else if (input.charAt(i) == '}' && stack.pop() != '{') {
                return false;
            } else if (input.charAt(i) == ']' && stack.pop() != '[') {
                return false;
            } else if (input.charAt(i) == ')' && stack.pop() != '(') {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
