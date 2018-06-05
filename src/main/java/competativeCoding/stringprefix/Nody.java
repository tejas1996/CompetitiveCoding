package competativeCoding.stringprefix;

import java.util.ArrayList;

public class Nody {

    char nodeValue;
    ArrayList<Integer> number = new ArrayList<Integer>();
    ArrayList<Nody> child = new ArrayList<Nody>();

    public Nody(char nodeValue, int number) {
        this.nodeValue = nodeValue;
        this.number.add(number);
    }

    public Nody contains(char a) {

        for (Nody now : child) {
            if (now.nodeValue == a)
                return now;
        }
        return null;
    }


}