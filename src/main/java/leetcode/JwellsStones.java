package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class JwellsStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String J = scanner.next();

        String S = scanner.next();
        int ans = numJewelsInStones(J, S);

        System.out.println(ans);


    }

    public static int numJewelsInStones(String J, String S) {

        HashSet<Character> characters = new HashSet<Character>();
        char[] chararray = J.toCharArray();
        for (int i = 0; i < J.length(); i++) {
            characters.add(chararray[i]);
        }


        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (characters.contains(S.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
