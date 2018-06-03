package competativeCoding;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SHKSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nody root = null, current = null;
        int t = sc.nextInt();
        int count = 0;
        while (count < t) {
            String value = sc.next();
            char[] array = new char[100];
            array = value.toCharArray();
            for (int i = 0; i < array.length; i++) {

                if (root == null) {
                    Nody node = new Nody(array[i], t);
                    root = node;
                    current = root;
                }
                if (current.contains(array[i])) {
                    current.number.add(t);
                } else {
                    Nody node = new Nody(array[i], t);

                }


// TODO this is where we are going to handle the condition in which we get words starting with different alphabets


            }


            count++;
        }


    }


}


public class Nody {

    char nodeValue;
    ArrayList<Integer> number = new ArrayList<Integer>();
    ArrayList<Nody> child = new ArrayList<Nody>();

    public Nody(char nodeValue, int number) {
        this.nodeValue = nodeValue;
        this.number.add(number);
    }

    public boolean contains(char a) {

        for (Nody now : child) {
            if (now.child.contains(a))
                return true;
        }
        return false;
    }


}



