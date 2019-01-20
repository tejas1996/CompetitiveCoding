package algorithms.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PrimeNode {

    static HashMap<Integer, NodeEarth> integerNodeHashMap = new HashMap<>();
    static HashSet<Integer> visited = new HashSet<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            NodeEarth node = new NodeEarth(i);
            integerNodeHashMap.put(i, node);
        }
        for (int i = 0; i < n - 1; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            integerNodeHashMap.get(first).nodes.add(integerNodeHashMap.get(second));
            integerNodeHashMap.get(second).nodes.add(integerNodeHashMap.get(first));
        }
        int totalAns = getPrimesTotal(integerNodeHashMap.get(1));
        System.out.println(totalAns);

    }

    public static int getPrimesTotal(NodeEarth nodeEarth) {

        ArrayList<NodeEarth> list = nodeEarth.nodes;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!visited.contains(list.get(i).data))
                sum = sum + list.get(i).data;
        }
        if (isPrime(sum)) {
            count++;
        }
        visited.add(nodeEarth.data);
        for (int i = 0; i < list.size(); i++) {
            NodeEarth current = list.get(i);
            if (!visited.contains(current.data)) {
                count = count + getPrimesTotal(list.get(i));
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if (number == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }


}
