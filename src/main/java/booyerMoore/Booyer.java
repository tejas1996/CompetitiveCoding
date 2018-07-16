package booyerMoore;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Booyer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the pattern");
        String pattern = scanner.next();
        HashMap<Character, Integer> badmatch = createBadMatch(pattern);
//        System.out.println("enter the bigger string");
        String bigSt = scanner.next();
        long millis = System.currentTimeMillis();
        System.out.println(checkForPattern(badmatch, pattern, bigSt));
        long after = System.currentTimeMillis();
        System.out.println(after - millis);


    }

    private static HashMap<Character, Integer> createBadMatch(String pattern) {

        HashMap<Character, Integer> badMatch = new HashMap<Character, Integer>();
        char[] chararr = pattern.toCharArray();
        for (int i = 0; i < chararr.length; i++) {

            if (i == chararr.length - 1) {
                Integer re = badMatch.get(chararr[i]);
                if (badMatch.get(chararr[i]) == null) {
                    badMatch.put(chararr[i], chararr.length);
                }
            } else {
                int value = chararr.length - i - 1;
                badMatch.put(chararr[i], value);
            }

        }
        return badMatch;

    }


    private static int checkForPattern(HashMap<Character, Integer> badmatch, String pattern, String bigSt) {

        int count = 0;
        for (int i = pattern.length() - 1; i < bigSt.length(); i++) {

            for (int k = pattern.length() - 1; k >= 0; k--) {
                if (bigSt.charAt(k + (i - pattern.length() + 1)) == pattern.charAt(k)) {
                    if (k == 0) {
                        count++;
                    }
                    continue;
                }
                Integer valueToAdd = badmatch.get(bigSt.charAt(i));
                if (null == valueToAdd) {
                    valueToAdd = pattern.length();
                }
                i = i + valueToAdd - 1;
                break;
            }


        }
        return count;
    }
}
