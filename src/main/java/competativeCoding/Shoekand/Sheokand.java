package competativeCoding.Shoekand;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Sheokand {

    public static void main(String[] args) {
        TreeMap<Double, Tuple> treeMap = new TreeMap<>();

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (i != j) {
                    Tuple tuple = new Tuple(i, j);
                    double number = (Math.pow(2, i) + Math.pow(2, j));
                    treeMap.put(number, tuple);

                }
            }

        }

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            double number = scanner.nextDouble();
            Map.Entry<Double, Tuple> min = treeMap.floorEntry(number);
            Map.Entry<Double, Tuple> max = treeMap.ceilingEntry(number);
            int re = (int) Math.min((max.getKey() - number), (number - min.getKey()));
            System.out.println(re);
            t--;
        }

    }
}
