package algorithms.Heap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Node node2 = new Node(3);
        Node node = new Node(1);
        Node node1 = new Node(2);

        Comparator<Node> comparator = (o1, o2) -> o1.value - o2.value;

        TreeMap<Node, Integer> nodeIntegerTreeMap = new TreeMap<>(comparator);
        nodeIntegerTreeMap.put(node2, 21);
        nodeIntegerTreeMap.put(node1, 21);
        nodeIntegerTreeMap.put(node, 214);
        System.out.println(nodeIntegerTreeMap.get(node));


//        TreeSet<Node> hash = new TreeSet<>(comparator);
//        hash.add(node);
//        hash.add(node1);
//        hash.add(node2);
//        System.out.println("done");

//
//        TreeSet<Integer> integers = new TreeSet<>();
//        integers.add(1);
//        integers.add(6);
//        integers.add(2);
//        integers.add(10);
//
//        while (!integers.isEmpty()){
//            System.out.println(integers.pollFirst());
//        }

    }


    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
