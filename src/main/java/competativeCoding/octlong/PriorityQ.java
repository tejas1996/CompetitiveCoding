package competativeCoding.octlong;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(20, Collections.reverseOrder());
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(17);
        System.out.println(priorityQueue.poll());


    }

}
