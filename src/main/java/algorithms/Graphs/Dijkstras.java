package algorithms.Graphs;

import competativeCoding.declong.MAXEP;

import java.util.*;

public class Dijkstras {

    public static Comparator<DistanceNode> distanceComparator = new Comparator<DistanceNode>() {

        @Override
        public int compare(DistanceNode o1, DistanceNode o2) {
            return o1.value - o2.value;
        }


    };

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        LinkedList<DistanceNode>[] graph = formDirectedGraph();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        dijktras(graph, start, end);


    }

    private static void dijktras(LinkedList<DistanceNode>[] graph, int start, int end) {

        int current = start;
        Queue<DistanceNode> integerPriorityQueue = new PriorityQueue<>(100, distanceComparator);

        HashMap<Integer, Integer> distanceHash = new HashMap<>();
        distanceHash.put(start, 0);

        integerPriorityQueue.add(new DistanceNode(start, 0));
        int currentDistance = 0;
        while (current != end) {

            if (distanceHash.containsKey(current)) {
                currentDistance = distanceHash.get(current);
            } else {
                currentDistance = Integer.MAX_VALUE;
            }
            LinkedList<DistanceNode> nodes = graph[current];
            for (int i = 0; i < nodes.size(); i++) {
                int tempDist = Integer.MAX_VALUE;
                if (distanceHash.containsKey(nodes.get(i).value)) {
                    tempDist = distanceHash.get(nodes.get(i).value);
                }
                if ((currentDistance + nodes.get(i).distance) < tempDist) {
                    distanceHash.put(nodes.get(i).value, nodes.get(i).distance + currentDistance);
                    integerPriorityQueue.add(new DistanceNode(nodes.get(i).value, nodes.get(i).distance + currentDistance));
                }
            }

            current = integerPriorityQueue.remove().value;

        }
        System.out.println("done");
    }

    private static LinkedList<DistanceNode>[] formDirectedGraph() {

        LinkedList<DistanceNode>[] graph = new LinkedList[10];

        graph[0] = new LinkedList<DistanceNode>();
        graph[1] = new LinkedList<DistanceNode>();
        graph[2] = new LinkedList<DistanceNode>();
        graph[3] = new LinkedList<DistanceNode>();
        graph[4] = new LinkedList<DistanceNode>();
        graph[5] = new LinkedList<DistanceNode>();
        graph[6] = new LinkedList<DistanceNode>();


        graph[1].add(new DistanceNode(2, 1));
        graph[2].add(new DistanceNode(3, 4));
        graph[3].add(new DistanceNode(4, 2));
        graph[4].add(new DistanceNode(5, 4));
        graph[5].add(new DistanceNode(6, 7));
        graph[3].add(new DistanceNode(6, 1));
        graph[1].add(new DistanceNode(3, 7));


        // Graph will be
    /*

    1     4 ----- 5
      \
    |  \  |       |
        \
    2 --- 3 ------6

     */


        return graph;
    }

}
