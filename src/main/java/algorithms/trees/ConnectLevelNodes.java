package algorithms.trees;

import java.util.HashMap;

public class ConnectLevelNodes {

    // we are using hashmap to store the last node that we traversed on a level
    // as we are going from left to right we can connect the stored node to the new node that we get on that level.
    static HashMap<Integer, Node> data = new HashMap<>();

    public static void main(String[] args) {

        Node root = formTree();
        connectNodes(root, 0);
        System.out.println("done");

    }

    private static void connectNodes(Node node, int level) {

        if (node == null) {
            return;
        }
        if (data.containsKey(level)) {
            Node left = data.get(level);
            if (left != null) {
                left.nexrRight = node;
                data.put(level, node);
            }
        } else {
            data.put(level, node);
        }

        connectNodes(node.left, level + 1);
        connectNodes(node.right, level + 1);

    }

    private static Node formTree() {

        Node root = new Node(5);
        Node three = new Node(3);
        Node eight = new Node(8);
        root.left = three;
        root.right = eight;
        Node one = new Node(1);
        Node six = new Node(6);
        three.left = one;
        three.right = six;
        Node twe = new Node(12);
        eight.right = twe;
        return root;

    }


}
