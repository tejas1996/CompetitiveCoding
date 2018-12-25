package algorithms.strings;

import com.sun.xml.internal.stream.StaxErrorReporter;

import java.util.Scanner;
import java.util.Stack;

public class LongestPalindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            String query = scanner.next();
            int count = 0;
            int max = 0;
            int start = 0;
            int end = 0;
            for (int i = 0; i < query.length(); i++) {
                Stack stack = new Stack();
                boolean isExtra = false;
                for (int j = 0; j < i; j++) {
                    stack.push(query.charAt(j));
                }
                int newI = i;
                if (!stack.isEmpty()) {
                    if (i + 1 < query.length() && query.charAt(i + 1) == (char) stack.peek()) {
                        count = count + 3;

                        if (count > max) {
                            max = count;
                            start = i - 1;
                            end = i + 1;
                        }
                        isExtra = true;
                    }

                    if (isExtra) {
                        newI = i + 2;
                        stack.pop();
                    }
                }
                for (int j = newI; j < query.length(); j++) {

                    if (!stack.isEmpty() && query.charAt(j) == (char) stack.pop()) {
                        count += 2;
                        if (count > max) {
                            max = count;
                            start = i - (count / 2);
                            end = i + (count / 2) - 1;
                        }
                    } else {
                        count = 0;
                        break;
                    }
                }

            }

            System.out.println(query.substring(start, end + 1));

            t--;
        }


    }


}
