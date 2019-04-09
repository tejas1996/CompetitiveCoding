package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;

public class SortString {
    public static void main(String[] args) {

        String input = "zabcatz";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!hashMap.containsKey(input.charAt(i))) {
                hashMap.put(input.charAt(i), 1);
            } else {
                int fin = hashMap.get(input.charAt(i));
                hashMap.put(input.charAt(i), fin + 1);
            }
        }
//        Sys/\tem.out.println("dond");
        for (Character character : hashMap.keySet()) {
            System.out.println(character);
        }
    }
}
