package algorithms.Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju {

    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    static Stack stack = new Stack();

    public static void main(String[] args) {

        ArrayList<Tuple> edges = new ArrayList<>();
        int n = 5;
        edges.add(new Tuple(2, 1));
        edges.add(new Tuple(3, 2));
        edges.add(new Tuple(1, 3));
        edges.add(new Tuple(1, 4));
        edges.add(new Tuple(4, 5));
        formGraph(edges, n);
        System.out.println("dond");
        findSCC(adj, n);
        System.out.println("done again");
        adj = rotate(adj);
        System.out.println("hope");
    }

    private static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> tmep = new ArrayList<>();

        for (int i = 0; i < adj.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(i);
            tmep.add(arr);
        }
        for (int i = 1; i < adj.size(); i++) {
            ArrayList<Integer> arr = adj.get(i);
            for (int j = 1; j < arr.size(); j++) {
                tmep.get(arr.get(j)).add(i);
            }
        }
        return tmep;
    }

    private static int findSCC(ArrayList<ArrayList<Integer>> adj, int n) {

        int[] visited = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (visited[adj.get(i).get(0)] != 1) {
                visited[adj.get(i).get(0)] = 1;
                dfs(adj.get(i).get(0), visited);
            }
            if (visited[adj.get(i).get(0)] != 1) {
                stack.add(adj.get(i).get(0));
            }
        }

        return 0;
    }

    private static void dfs(int v, int[] visited) {
        visited[v] = 1;
        for (int i = 1; i < adj.get(v).size(); i++) {
            if (visited[adj.get(v).get(i)] != 1)
                dfs(adj.get(v).get(i), visited);
        }
        stack.add(v);
    }

    private static void formGraph(ArrayList<Tuple> edges, int n) {

        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            adj.add(temp);
        }

        for (int i = 0; i < edges.size(); i++) {
            Tuple current = edges.get(i);
            adj.get(current.start).add(current.end);
        }
    }

    public static class Tuple {
        int start;
        int end;

        public Tuple(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }


}
