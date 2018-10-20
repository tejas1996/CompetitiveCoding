package competativeCoding.snackdown18;

import java.util.HashMap;
import java.util.Scanner;

public class TYPING {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int total = 0;
            HashMap<String, Integer> hash = new HashMap<>();

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {

                String word = scanner.next();
                if (hash.containsKey(word)) {
                    total = total + hash.get(word) / 2;
                } else {
                    int ans = getSum(word);
                    total = total + ans;
                    hash.put(word, ans);
                }

            }
            System.out.println(total);

            t--;
        }


    }


    public static int getSum(String word) {
        char[] wordarr;
        wordarr = word.toCharArray();
        int sum = 0;
        int flag = 0;
        sum = sum + 2;
        if (wordarr[0] == 'd' || wordarr[0] == 'f') {
            flag = 0;

        } else {
            flag = 1;
        }

        for (int j = 1; j < wordarr.length; j++) {

            if (flag == 0) {
                if (wordarr[j] == 'd' || wordarr[j] == 'f') {
                    sum = sum + 4;
                    flag = 0;
                } else {
                    sum = sum + 2;
                    flag = 1;
                }
            } else {
                if (wordarr[j] == 'd' || wordarr[j] == 'f') {
                    sum = sum + 2;
                    flag = 0;
                } else {
                    sum = sum + 4;
                    flag = 1;
                }
            }

        }

        return sum;

    }

}
