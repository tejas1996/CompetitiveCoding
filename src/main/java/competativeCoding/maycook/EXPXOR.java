package competativeCoding.maycook;

import java.util.*;

public class EXPXOR {

    static HashMap<Integer, ArrayList<Double>> ans = new HashMap<>();
    static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            ans = new HashMap<>();
            integers = new ArrayList<>();

            int n = scanner.nextInt();
            ArrayList<Integer> beauty = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                beauty.add(scanner.nextInt());
            }
            ArrayList<Double> prob = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                prob.add(scanner.nextDouble());
            }

            recurse(beauty, prob, 0, n, 0, 1);
            Iterator iterator = ans.entrySet().iterator();
            double finalans = 0;
            int xor = 0;
            ArrayList<Double> list;
            for (int i = 0; i < integers.size(); i++) {
                xor = integers.get(i);
                list = ans.get(xor);
                double sum = 0;
                for (int j = 0; j < list.size(); j++) {
                    double tem = list.get(j);
                    sum += xor * tem;
                }
                finalans += sum;

            }


            System.out.println(finalans);

            t--;
        }

    }

    private static void recurse(ArrayList<Integer> beauty, ArrayList<Double> prob, int index, int n, int xor, double sum) {

        if (sum == 0) {
            return;
        }
        if (index == n) {
            if (!ans.containsKey(xor)) {
                ArrayList<Double> temp = new ArrayList<>();
                temp.add(sum);
                ans.put(xor, temp);
                integers.add(xor);
            } else {
                ans.get(xor).add(sum);
            }
            return;
        }
        int newxor = myXOR(xor, beauty.get(index));
        recurse(beauty, prob, index + 1, n, newxor, sum * prob.get(index));
        recurse(beauty, prob, index + 1, n, xor, sum * (1 - prob.get(index)));

    }

    static int myXOR(int x, int y) {
        return (x | y) &
                (~x | ~y);
    }
}
