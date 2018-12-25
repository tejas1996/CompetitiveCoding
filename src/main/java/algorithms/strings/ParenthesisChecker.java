package algorithms.strings;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            Stack stack = new Stack();
            String query = scanner.next();
            boolean flag = false;
            for (int i = 0; i < query.length(); i++) {
                char paran = query.charAt(i);
                if (paran == '{' || paran == '(' || paran == '[') {
                    stack.push(paran);
                }
                if (paran == '}') {
                    if (stack.isEmpty()) {
                        flag = true;
                        break;
                    }
                    char top = (char) stack.pop();
                    if (top != '{') {

                        flag = true;
                        break;
                    }
                } else if (paran == ']') {
                    if (stack.isEmpty()) {
                        flag = true;
                        break;
                    }
                    char top = (char) stack.pop();
                    if (top != '[') {

                        flag = true;
                        break;
                    }
                } else if (paran == ')') {
                    if (stack.isEmpty()) {
                        flag = true;
                        break;
                    }
                    char top = (char) stack.pop();
                    if (top != '(') {

                        flag = true;
                        break;
                    }
                }

            }
            if (flag == false && stack.isEmpty()) {
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }

            t--;
        }


    }

}
