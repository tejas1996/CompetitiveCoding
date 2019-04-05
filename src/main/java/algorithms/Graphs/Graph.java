package algorithms.Graphs;

import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// class to represent a graph object
public class Graph {
    // data structure to store graph edges

    List<List<Integer>> adj = new ArrayList<>();

    public Graph(List<Edge> edges) {
        for (int i = 0; i < edges.size(); i++)
            adj.add(i, new ArrayList<>());

        for (Edge current : edges) {
            // allocate new node in adjacency List from src to dest
            adj.get(current.src).add(current.dest);

            // Uncomment next line for undirected graph
            adj.get(current.dest).add(current.src);
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
        Graph graph = new Graph(edges);
        // print adjacency list representation of the graph
        printGraph(graph);
    }
}