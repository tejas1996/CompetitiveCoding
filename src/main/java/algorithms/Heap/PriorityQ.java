package algorithms.Heap;

import algorithms.Graphs.DistanceNode;
import algorithms.trees.Node;

import java.util.*;

public class PriorityQ {


    public static void main(String[] args) {

        Comparator<Node> nodComparator = new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value - o2.value;
            }
        };

        ArrayList<Node> data = new ArrayList<>();
        Node node = new Node(6);
        data.add(node);
        data.add(new Node(2));
        data.add(new Node(3));
        data.add(new Node(4));

        Queue<Node> priorityQueue = new PriorityQueue<>(100, nodComparator);
        for (int i = 0; i < data.size(); i++) {
            priorityQueue.add(data.get(i));
        }
        Node node1 = new Node(3);
        boolean result = priorityQueue.contains(node1);

        System.out.println(result);
//        System.out.println(priorityQueue.poll().value);
//        System.out.println(priorityQueue.poll().value);
//        System.out.println(priorityQueue.poll().value);
//        System.out.println(priorityQueue.poll().value);
    }
}
