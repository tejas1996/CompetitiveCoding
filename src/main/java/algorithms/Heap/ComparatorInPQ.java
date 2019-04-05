package algorithms.Heap;

import competativeCoding.Node;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ComparatorInPQ {
    public static void main(String[] args) {

        Comparator<Node> comparator = new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.item - o2.item;
            }
        };

        Comparator<Node> newOne = (o1, o2) -> o1.item - o2.item;

        Node one = new Node(1);
        Node two = new Node(4);
        Node three = new Node(2);

        Queue<Node> first = new PriorityQueue<>(100, comparator);
        first.add(one);
        first.add(two);
        first.add(three);

        System.out.println(first.poll().item);
        System.out.println(first.poll().item);
        System.out.println(first.poll().item);
    }
}
