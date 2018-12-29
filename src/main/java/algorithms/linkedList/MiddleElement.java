package algorithms.linkedList;

public class MiddleElement {

    public static void main(String[] args) {
        Node root = formLinkedList();
        Node middle = findMiddle(root);
        System.out.println(middle.value);

    }

    public static Node findMiddle(Node root) {
        Node slow = root;
        Node fast = root;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next == null) {
                break;
            }
            fast = fast.next;
        }
        return slow;

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
