package algorithms.Graphs;

import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// class to represent a graph object
public class Graph {
    // data structure to store graph edges

    List<List<Integer>> adj = new ArrayList<>();

    Graph(List<Edge> edges, int N) {
        adj = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            adj.add(i, new ArrayList<>());
        }

        // add edges to the undirected graph
        for (int i = 0; i < edges.size(); i++) {
            int src = edges.get(i).src;
            int dest = edges.get(i).dest;

            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
    }

    // print adjacency list representation of graph
    private static void printGraph(Graph graph) {
        int src = 0;
        int n = graph.adj.size();

        while (src < n) {
            // print current vertex and all its neighboring vertices
            for (int dest : graph.adj.get(src))
                System.out.print("(" + src + " --> " + dest + ")\t");

            System.out.println();
            src++;
        }
    }

    public static void formGraph(List<Edge> edges) {
        // Input: List of edges in a digraph (as per above diagram)
//		List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2),
//								new Edge(2, 0), new Edge(2, 1),new Edge(3, 2),
//								new Edge(4, 5), new Edge(5, 4));

        // construct graph from given list of edges
        Graph graph = new Graph(edges, edges.size());
        // print adjacency list representation of the graph
        printGraph(graph);
    }
}