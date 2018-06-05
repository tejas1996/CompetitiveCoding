package competativeCoding.stringprefix;

import competativeCoding.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SHKSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nody root = null, current = null;
        HashMap<Character, Nody> nodyHashMap = new HashMap<Character, Nody>();
        int t = sc.nextInt();
        int count = 0;
        while (count < t) {
            String value = sc.next();
            char[] array = new char[100];
            array = value.toCharArray();

            if (!nodyHashMap.containsKey(array[0])) {

                Nody nody = new Nody(array[0], count);
                nodyHashMap.put(array[0], nody);

            }

            root = nodyHashMap.get(array[0]);
            current = root;

            for (int i = 1; i < array.length; i++) {
                Nody chi = current.contains(array[i]);
                if (chi != null) {
                    current.number.add(count);
                    current = chi;
                } else {
                    Nody node = new Nody(array[i], count);
                    current.child.add(node);
                    current.number.add(count);
                    current = node;

                }


            }


            count++;
        }


        int noq = sc.nextInt();
        while (noq > 0) {

            int first = sc.nextInt();
            String query = sc.next();
            char[] finalst = new char[100];
            finalst = query.toCharArray();

            if (!nodyHashMap.containsKey(finalst[0])) {
                System.out.println("-1");
            }
            current = nodyHashMap.get(finalst[0]);

            for (int i = 1; i < finalst.length; i++) {

                if (current.child.contains(finalst[i])) {
                    continue;
                }
                System.out.println(current.number.get(0));
                break;

            }


            noq--;
        }


        System.out.println(nodyHashMap.size());


    }


}






