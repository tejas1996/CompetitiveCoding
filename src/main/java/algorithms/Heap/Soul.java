package algorithms.Heap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Soul {

    public static void main(String[] args) {

        List<List<Integer>> lot = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(1);
        one.add(1);
        one.add(1);
        List<Integer> two = new ArrayList<>();
        two.add(0);
        two.add(1);
        two.add(1);
        two.add(1);

        List<Integer> mid = new ArrayList<>();
        mid.add(0);
        mid.add(1);
        mid.add(0);
        mid.add(1);
        List<Integer> three = new ArrayList<>();
        three.add(1);
        three.add(1);
        three.add(9);
        three.add(1);

        List<Integer> four = new ArrayList<>();
        four.add(0);
        four.add(0);
        four.add(1);
        four.add(1);

        lot.add(one);
        lot.add(two);
        lot.add(mid);
        lot.add(three);
        lot.add(four);
        int ans = removeObstacle(5, 4, lot);

        System.out.println("doe");

    }

    static int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot) {
        // WRITE YOUR CODE HERE
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(getMeta(numRows, numRows, 0, 0));
        queue.add(-1);

        int count = 0;
        HashSet<Integer> hash = new HashSet<>();
        hash.add(0);
        while (!queue.isEmpty()) {
            int number = queue.poll();
            if (number == -1) {
                count++;
                if (queue.size() == 0) {
                    break;
                }
                queue.add(-1);
                continue;
            }
            int row = number / numColumns;
            int colom = number % numColumns;
            int actualNumber = lot.get(row).get(colom);
            if (actualNumber == 9) {
                return count;
            }
            if (row - 1 >= 0 && (lot.get(row - 1).get(colom) == 1 || lot.get(row - 1).get(colom) == 9)) {
                int meta = getMeta(numRows, numColumns, row - 1, colom);
                if (!hash.contains(meta)) {
                    hash.add(meta);
                    queue.add(meta);
                }

            }

            if (row + 1 < numRows && (lot.get(row + 1).get(colom) == 1 || lot.get(row + 1).get(colom) == 9)) {
                int meta = getMeta(numRows, numColumns, row + 1, colom);
                if (!hash.contains(meta)) {
                    hash.add(meta);
                    queue.add(meta);
                }
            }


            if (colom - 1 >= 0 && (lot.get(row).get(colom - 1) == 1 || lot.get(row).get(colom - 1) == 9)) {
                int meta = getMeta(numRows, numColumns, row, colom - 1);
                if (!hash.contains(meta)) {
                    hash.add(meta);
                    queue.add(meta);
                }
            }


            if (colom + 1 < numColumns && (lot.get(row).get(colom + 1) == 1 || lot.get(row).get(colom + 1) == 9)) {
                int meta = getMeta(numRows, numColumns, row, colom + 1);
                if (!hash.contains(meta)) {
                    hash.add(meta);
                    queue.add(meta);
                }
            }
        }

        return -1;


    }

    public static int getMeta(int numRows, int numColumns, int row, int colom) {

        return row * numColumns + colom;

    }
}
