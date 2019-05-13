package algorithms.Graphs;

import java.util.*;

class Main {
    // Perform DFS on graph starting from vertex v
    public static boolean DFS(Graph graph, int v, boolean[] discovered,
                              boolean[] color) {
        // do for every edge (v -> u)
        for (int u : graph.adj.get(v)) {
            // if vertex u is explored for first time
            if (discovered[u] == false) {
                // mark current node as discovered
                discovered[u] = true;
                // set color as opposite color of parent node
                color[u] = !color[v];

                // if DFS on any subtree rooted at v
                // we return false
                if (DFS(graph, u, discovered, color) == false)
                    return false;
            }
            // if the vertex is already been discovered and
            // color of vertex u and v are same, then the
            // graph is not Bipartite
            else if (color[v] == color[u]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // vector of graph edges as per above diagram
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 3), new Edge(2, 4),
                new Edge(2, 5), new Edge(5, 1)
                // if we remove 2->4 edge, graph is becomes Bipartite
        );

        // Set number of vertices in the graph
        final int N = 6;

        // create a graph from edges
        Graph graph = new Graph(edges, N);

        // stores vertex is discovered or not
        boolean[] discovered = new boolean[N];

        // stores color 0 or 1 of each vertex in BFS
        boolean[] color = new boolean[N];

        // mark source vertex as discovered and
        // set its color to 0
        discovered[0] = true;
        color[0] = false;

        // start DFS traversal from any node as graph
        // is connected and undirected
        if (DFS(graph, 1, discovered, color))
            System.out.println("Bipartite Graph");
        else
            System.out.println("Not a Bipartite Graph");
    }
}