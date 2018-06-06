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
        ArrayList<String> store = new ArrayList<String>();
        while (count < t) {
            String value = sc.next();
            store.add(value);
            char[] array = new char[100000];
            array = value.toCharArray();

            if (!nodyHashMap.containsKey(array[0])) {

                Nody nody = new Nody(array[0], count);
                nodyHashMap.put(array[0], nody);

            }

            root = nodyHashMap.get(array[0]);
            current = root;
            int flag = 0;
            for (int i = 1; i < array.length; i++) {
                Nody chi = current.contains(array[i]);
                if (chi != null) {
                    current.number.add(count);
                    current = chi;
                } else {
                    flag = 1;
                    Nody node = new Nody(array[i], count);
                    current.child.add(node);
                    current.number.add(count);
                    current = node;

                }


            }

            if (flag == 0) {
                current.number.add(count);
            }



            count++;
        }


        int noq = sc.nextInt();
        while (noq > 0) {

            int first = sc.nextInt();
            String query = sc.next();
            char[] finalst = new char[100000];
            finalst = query.toCharArray();

            if (!nodyHashMap.containsKey(finalst[0])) {
                System.out.println(findLex1(store, Integer.MAX_VALUE));
                noq--;
                continue;
            }
            current = nodyHashMap.get(finalst[0]);

            for (int i = 1; i < finalst.length; i++) {

                Nody chi = current.contains(finalst[i]);
                if (chi != null) {
                    if (i == (finalst.length - 1)) {
                        System.out.println(findLex(chi.number, store, first));
                    }
                    current = chi;
                    continue;
                }
                System.out.println(findLex(current.number, store, first));
                break;

            }


            noq--;
        }


    }

    private static String findLex(ArrayList<Integer> integer, ArrayList<String> store, int first) {

        // logic for lex

        String min = "zzzzzzzzzzzzzzzzz";
        for (Integer i : integer) {
            if (min.compareTo(store.get(i)) > 0) {
                if (i < first)
                    min = store.get(i);
            }


        }
        return min;

    }

    private static String findLex1(ArrayList<String> store, int first) {

        // logic for lex

        String min = "zzzzzzzzzzzzzzzzz";
        for (Integer i = 0; i < store.size(); i++) {
            if (min.compareTo(store.get(i)) > 0) {
                if (i < first)
                    min = store.get(i);
            }


        }
        return min;

    }


}






