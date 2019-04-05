package algorithms.linkedList;

public class ReArrangeInOrder {
    static boolean flag = true;

    public static void main(String[] args) {

        Node root = formLinkedList();
        Node answer = reArrange(root, root);
        System.out.println(flag);

    }

    private static Node reArrange(Node head, Node current) {

        Node ret = null;
        if (current == null) {
            return head;
        } else {
            ret = reArrange(head, current.next);
        }

        if (current.data != ret.data) {
            flag = false;
        }

        return ret.next;
    }


    public static Node formLinkedList() {

        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
//        Node four = new Node(3);
        Node five = new Node(2);
        Node six = new Node(1);
        root.next = two;
        two.next = three;
        three.next = five;
//        four.next = five;
        five.next = six;
//        six.next = ix;
        return root;
    }
}
