package algorithms.linkedList;

public class DetectLoop {
    public static void main(String[] args) {

        Node head = formLinkedList();
        detectLoop(head);
    }

    private static void detectLoop(Node head) {

        Node slow = head;
        Node fast = head.next;
        while (true) {
            if (fast == slow) {
                if (fast == null && slow == null) {
                    System.out.println("False");
                    break;
                }
                System.out.println("True");
                break;
            } else {
                if (fast != null) {
                    if (fast.next != null) {
                        fast = fast.next.next;
                    } else {
                        fast = null;
                    }
                }
                if (slow != null) {
                    slow = slow.next;
                }
            }
        }

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
//        five.next = six;
        return root;
    }


}
