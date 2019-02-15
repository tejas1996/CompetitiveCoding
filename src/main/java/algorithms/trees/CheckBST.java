package algorithms.trees;

public class CheckBST {

    public static void main(String[] args) {

        Node node = formTree();
        boolean isIT = isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(isIT);


    }

    private static boolean isBST(Node node, int minValue, int maxValue) {

        if (node == null) {
            return true;
        }

        if (node.value < minValue || node.value > maxValue) {
            return false;
        }

        if (isBST(node.left, minValue, node.value - 1) && isBST(node.right, node.value + 1, maxValue)) {
            return true;
        } else {
            return false;
        }


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

        return root;

    }

}
