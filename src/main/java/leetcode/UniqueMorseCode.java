package leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCode {

    static String[] str = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    static HashMap<Character, String> dict = new HashMap<>();

    public static void main(String[] args) {

        for (int i = 0; i < str.length; i++) {
            dict.put((char) (i + 97), str[i]);
        }
        String[] words = {"gin", "zen", "gig", "msg"};
        int ans = uniqueMorseRepresentations(words);

        System.out.println(ans);


    }

    public static int uniqueMorseRepresentations(String[] words) {

//        String[] str =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//        HashMap<Character,String> dict = new HashMap<>();
//        for (int i = 0; i < str.length; i++) {
//            dict.put((char)(i +97), str[i]);
//        }


        HashSet<String> hashSet = new HashSet<>();

        for (int e = 0; e < words.length; e++) {
            String number = convert(words[e]);
            if (!hashSet.contains(number)) {
                hashSet.add(number);
            }
        }

        return hashSet.size();
    }

    private static String convert(String word) {

        String code = "";
        for (int i = 0; i < word.length(); i++) {
            code = code + dict.get(word.charAt(i));
        }
        return code;

    }
}
