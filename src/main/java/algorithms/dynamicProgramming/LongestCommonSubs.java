package algorithms.dynamicProgramming;

import com.sun.xml.internal.ws.server.ServerRtException;
import org.w3c.dom.css.CSSStyleRule;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonSubs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n, m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            String first = scanner.next();
            String second = scanner.next();
            ArrayList<Integer> index = new ArrayList<>();

            if (n < m) {
                String temp = first;
                first = second;
                second = temp;
            }

            for (int i = 0; i < first.length(); i++) {
                index.add(0);
            }
            for (int i = 0; i < second.length(); i++) {

                char ch = second.charAt(i);
//                String temp = String.valueOf(ch);

                if (first.indexOf(String.valueOf(ch)) != -1) {
                    int tmepIndex = first.indexOf(String.valueOf(ch));
                    ArrayList<Integer> all = new ArrayList<>();
                    while (tmepIndex >= 0) {
                        all.add(tmepIndex);
                        tmepIndex = first.indexOf(String.valueOf(ch), tmepIndex + 1);
                    }

                    for (int j = 0; j < all.size(); j++) {

                        int loc = all.get(j);
                        int maxIndex = 0;
                        for (int k = 0; k < loc; k++) {
                            if (index.get(k) > maxIndex && first.charAt(k) != ch) {
                                maxIndex = index.get(k);
                            }
                        }
                        if (maxIndex == 0) {
                            index.add(loc, 1);
                        } else {
                            index.add(loc, maxIndex + 1);
                        }
                    }
                }
            }

//            for (int i = 0; i < first.length(); i++) {
//                char ch = first.charAt(i);
//                System.out.println(ch + "  " + index.get(i));
//            }


            int ans = 0;
            for (int i = 0; i < first.length(); i++) {
                if (index.get(i) > ans) {
                    ans = index.get(i);
                }
            }
            System.out.println(ans);

            t--;
        }

    }
}
