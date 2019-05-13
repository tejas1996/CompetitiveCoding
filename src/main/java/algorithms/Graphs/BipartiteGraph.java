package algorithms.Graphs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BipartiteGraph {
    public static void main(String[] args) {

        List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2),
                new Edge(2, 3), new Edge(3, 4), new Edge(1, 4),
                new Edge(4, 1));
        Graph graph = new Graph(edges, edges.size());
        List<List<Integer>> adj = graph.adj;
        boolean answer = checkBipartite(adj);
        System.out.println(answer);
    }

    private static boolean checkBipartite(List<List<Integer>> adj) {

        HashSet<Integer> white = new HashSet<>();
        HashSet<Integer> black = new HashSet<>();
        white.add(0);
        boolean flag = true;
        for (int i = 0; i < adj.size(); i++) {
            List<Integer> current = adj.get(i);
            if (white.contains(current)) {
                flag = true;
            } else {
                flag = false;
            }
            for (int j = 0; j < current.size(); j++) {
                if (flag == false) {
                    if (white.contains(current.get(j))) {
                        return false;
                    }
                    black.add(current.get(j));
                } else {
                    if (black.contains(current.get(j))) {
                        return false;
                    }
                    white.add(current.get(j));
                }

            }
        }

        return true;
    }
}
