package algorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class VerticalTreePrint {

    static HashMap<Integer, ArrayList<Integer>> map = new HashMap();
    static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Node root = formTree();

        printVertical(root, 0);
        for (int i = min; i <= max; i++) {
            ArrayList<Integer> list = map.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }

        }


    }

    private static void printVertical(Node node, int level) {

        if (node == null) {
            return;
        }
        if (level < min) {
            min = level;
        }
        if (level > max) {
            max = level;
        }
        if (map.containsKey(level)) {
            ArrayList list = map.get(level);
            list.add(node.value);
            map.put(level, list);
        } else {
            ArrayList<Integer> list = new ArrayList();
            list.add(node.value);
            map.put(level, list);
        }

        printVertical(node.left, level - 1);
        printVertical(node.right, level + 1);

    }


    private static Node formTree() {

        Node root = new Node(5);
        Node three = new Node(3);
        Node eight = new Node(8);
        root.left = three;
        root.right = eight;
        Node one = new Node(1);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node nine = new Node(9);
        eight.left = seven;
        eight.right = nine;
        three.left = one;
        three.right = six;

        return root;

    }


}
