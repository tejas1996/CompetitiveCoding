package algorithms.strings;

import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            String string = scanner.next();
            String reverseString = reverse(string, 0, string.length() - 1);
            int count = 0;
            while (count < string.length()) {
                int start = count;
                while (reverseString.charAt(count) != '.') {
                    count++;
                    if (count == reverseString.length()) {
                        break;
                    }
                }
                String reverseWord = reverse(reverseString.substring(start, count), 0, reverseString.substring(start, count).length() - 1);
                for (int i = 0; i < reverseString.substring(start, count).length(); i++) {
                    reverseString = reverseString.substring(0, start + i) + reverseWord.charAt(i) + reverseString.substring(start + i + 1);
                }
                count++;

            }

            System.out.println(reverseString);

            t--;
        }


    }

    public static String reverse(String string, int start, int end) {

        char[] chararray = new char[100];
        chararray = string.toCharArray();
        while (start < end) {
            char temp = chararray[start];
            chararray[start] = chararray[end];
            chararray[end] = temp;
            start++;
            end--;
        }

        return new String(chararray);
    }

}
