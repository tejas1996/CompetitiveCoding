package booyerMoore;

import java.util.Scanner;

public class GoodOld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bigStr = scanner.next();
        String pattern = scanner.next();
        long millis = System.currentTimeMillis();
        System.out.println(bigStr.contains(pattern));
        long after = System.currentTimeMillis();
        System.out.println(after - millis);
    }

}
