package algorithms.trees;

import algorithms.trees.Node;

public class SymericTree {

    public static void main(String[] args) {

        Node root = formTree();
        boolean isSymeyric = checkSymetry(root.left, root.right);
        System.out.println(isSymeyric);


    }

    private static boolean checkSymetry(Node left, Node right) {

        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }

        if (left.value != right.value) {
            return false;
        }

        return (checkSymetry(left.left, right.right) && checkSymetry(left.right, right.left));

    }

    private static Node formTree() {

        Node root = new Node(5);
        Node three = new Node(3);
        Node three2 = new Node(3);
        root.left = three;
        root.right = three2;
        Node one1 = new Node(1);
        Node one2 = new Node(1);
        Node two = new Node(2);
        Node two2 = new Node(2);
        three.left = one1;
        three.right = two;
        three2.left = two2;
        three2.right = one2;


        return root;

    }


}
