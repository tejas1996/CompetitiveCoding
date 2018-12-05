package competativeCoding.novlunch;

import java.util.HashMap;
import java.util.Scanner;

public class EVENT {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("saturday", 0);
        hashMap.put("sunday", 1);
        hashMap.put("monday", 2);
        hashMap.put("tuesday", 3);
        hashMap.put("wednesday", 4);
        hashMap.put("thursday", 5);
        hashMap.put("friday", 6);
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            String start = scanner.next();
            String end = scanner.next();
            int b = scanner.nextInt();
            int l = scanner.nextInt();

            int startNumber = hashMap.get(start);
            int endNumber = hashMap.get(end);
            int factor = Math.abs(startNumber - endNumber) + 1;
            if (startNumber == endNumber) {
                factor = 8;
            }
            int count = 0;
            int remember = 0;
            for (int i = b; i < l || i < l + 20; i++) {
                if (i % factor == 0) {

                    remember = i;
                    count++;

                }
            }
            if (count == 1) {
                System.out.println(remember);
            }
            if (count == 0) {
                System.out.println("impossible");
            }


//                    System.out.println(start + " " + end + " " + b + " " + l);

            t--;
        }


    }

}
