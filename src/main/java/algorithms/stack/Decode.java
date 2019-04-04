package algorithms.stack;

import java.util.Stack;

class Decode {
    // Function to decode the given sequence to construct minimum number
    // without repeated digits
    public static StringBuilder decode(String seq) {
        // result store output String
        StringBuilder result = new StringBuilder();

        // create an empty stack of integers
        Stack<Integer> stack = new Stack<>();

        // run n+1 times where n is length of input sequence
        for (int i = 0; i <= seq.length(); i++) {
            // push number i+1 into the stack
            stack.push(i + 1);

            // if all characters of the input sequence are processed or
            // current character is 'I' (increasing)
            if (i == seq.length() || seq.charAt(i) == 'I') {
                // run till stack is empty
                while (!stack.empty()) {
                    // remove top element from the stack and add it to soln.
                    result.append(stack.pop());
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // input sequence
        String seq = "IIDDIDID";

        System.out.println("Minimum number is " + decode(seq));
    }
}