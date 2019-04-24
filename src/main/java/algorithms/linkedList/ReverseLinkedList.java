package algorithms.linkedList;

public class ReverseLinkedList {

    static Node last = null;

    public static void main(String[] args) {


        Node root = formLinkedList();
        Node ans = reverse(root);
        root.next = null;
        System.out.println("done man");

    }

    private static Node reverse(Node node) {

        Node next = null;
        if (node.next != null) {
            next = reverse(node.next);
        }
        if (node.next == null) {
            last = node;
            return node;
        }

        next.next = node;

        return node;

    }

    public static Node formLinkedList() {

        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
//        five.next = two;
        five.next = six;
        return root;
    }
}
