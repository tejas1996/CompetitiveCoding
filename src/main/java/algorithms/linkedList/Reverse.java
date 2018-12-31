package algorithms.linkedList;

public class Reverse {

    public static void main(String[] args) {


        Node head = formLinkedList();
        Node newHead = reverseList(head);
        head.next = null;
        System.out.println("got it");

    }

    private static Node reverseList(Node node) {

        if (node.next == null) {
            return node;
        }
        Node newHead = reverseList(node.next);
        node.next.next = node;
        return newHead;

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
//        five.next = six;
        return root;
    }

}
