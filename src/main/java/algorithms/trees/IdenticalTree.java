package algorithms.trees;

public class IdenticalTree {

    public static void main(String[] args) {

        Node root1 = formTree1();
        Node root2 = formTree2();
        boolean areIdentical = checkIdentical(root1, root2);
        System.out.println(areIdentical);

    }

    private static boolean checkIdentical(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.value != node2.value) {
            return false;
        }
        return (checkIdentical(node1.left, node2.left) && checkIdentical(node1.right, node2.right));
    }


    private static Node formTree1() {

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

    private static Node formTree2() {

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
