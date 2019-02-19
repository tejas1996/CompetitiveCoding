package leetcode;

import java.util.Scanner;

public class SeperateEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];
        for (int i = 0; i < 1; i++) {
            strings[i] = scanner.next();
        }

        numUniqueEmails(strings);


    }

    public static int numUniqueEmails(String[] emails) {

        for (int i = 0; i < emails.length; i++) {

            String temp = emails[0];
            String name = temp.substring(0, temp.lastIndexOf("@"));
            System.out.println("name here is " + name);
            String domain = temp.substring(temp.lastIndexOf("@"), temp.length());
            name = name.replaceAll("\\.", "");
            if (name.indexOf("+") > 0) {
                name = name.substring(0, name.indexOf("+"));
            }

            System.out.println("name is " + name + "domain is " + domain);

        }
        return 2;
    }
}
