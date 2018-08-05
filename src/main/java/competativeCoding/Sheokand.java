package competativeCoding;

import java.util.HashMap;
import java.util.TreeMap;

public class Sheokand {

    public static void main(String[] args) {
        TreeMap<Double, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < 40; i++) {
            double num = Math.pow(2, i);
            treeMap.put(num, i);
        }
        System.out.println("fas");
        System.out.println(treeMap.ceilingEntry((double) 45));


    }
}
