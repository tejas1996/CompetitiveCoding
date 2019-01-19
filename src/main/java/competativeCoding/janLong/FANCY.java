package competativeCoding.janLong;

import java.util.Scanner;

public class FANCY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t > 0) {
            String quote = scanner.nextLine();
            if (quote.contains(" not ") || quote.startsWith("not ") || quote.endsWith(" not") || quote.equals("not")) {
                System.out.println("Real Fancy");
            } else {
                System.out.println("regularly fancy");
            }

            t--;
        }


    }
}
