package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FilesSize {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        solution(input);
    }

    private static void solution(String S) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("music", 0);
        hashMap.put("images", 0);
        hashMap.put("movies", 0);
        hashMap.put("other", 0);
        String[] seperate = S.split("\n");
        for (int i = 0; i < seperate.length; i++) {
            System.out.println("string is  " + seperate[i]);
        }
        System.out.println(seperate.length);
        for (int i = 0; i < seperate.length; i++) {
            String name, size;
            String[] temp = S.split(" ");
            name = temp[0];
            size = temp[1];
            size = size.replace("b", "");
            int actualSize = Integer.parseInt(size);
            String exe = checkExt(name);
            if (exe.equals("mp3") || exe.equals("acc") || exe.equals("flac")) {
                Integer current = hashMap.get("music");
                hashMap.put("music", current + actualSize);
            } else if (exe.equals("jpg") || exe.equals("bmp") || exe.equals("gif")) {
                Integer current = hashMap.get("images");
                hashMap.put("images", current + actualSize);
            } else if (exe.equals("mp4") || exe.equals("avi") || exe.equals("mkv")) {
                Integer current = hashMap.get("movies");
                hashMap.put("movies", current + actualSize);
            } else {
                Integer current = hashMap.get("other");
                hashMap.put("other", current + actualSize);
            }
            System.out.println(exe);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("music " + hashMap.get("music"));
        sb.append("\n");
        sb.append("images " + hashMap.get("images"));
        sb.append("\n");
        sb.append("movies " + hashMap.get("movies"));
        sb.append("\n");
        sb.append("other " + hashMap.get("other"));

        String ans = sb.toString();

    }

    private static String checkExt(String s) {

        int index = s.lastIndexOf(".");
        String exe = s.substring(index + 1, s.length());

        return exe;
    }
}
