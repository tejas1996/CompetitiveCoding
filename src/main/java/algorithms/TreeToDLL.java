package algorithms;

public class TreeToDLL {

    public static void main(String[] args) {

        Node root = formTree();

        Node left = convertToDLL(root.left, "left");
        Node right = convertToDLL(root.right, "right");
        if (left != root) {
            left.right = root;
            root.left = left;
        }
        if (right != root) {
            right.left = root;
            root.right = right;
        }
        System.out.println("done here");


    }

    private static Node convertToDLL(Node node, String type) {

        if (node == null) {
            return null;
        }

        Node left = node, right = node;
        if (node.left != null) {
            left = convertToDLL(node.left, "left");
        }

        if (node.right != null) {
            right = convertToDLL(node.right, "right");
        }

        if (left != node) {
            left.right = node;
            node.left = left;
        }
        if (right != node) {
            right.left = node;
            node.right = right;
        }


        if (type.equals("left")) {
            return right;
        } else {
            return left;
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
        Node nine = new Node(9);
        three.left = one;
        three.right = six;
        eight.right = nine;

        return root;

    }

}
