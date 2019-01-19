package algorithms.Graphs;//Code by Saksham Raj seth

import java.io.*;
import java.util.*;

class DFS {
    private static int V;
    private static LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    DFS(int v) {
        V = v;
        adj = new LinkedList[10001];
        for (int i = 0; i < 10001; ++i)
            adj[i] = new LinkedList<Integer>();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean[] vis = new boolean[10001];
            for (int i = 0; i < 10001; i++)
                vis[i] = false;
            int n = sc.nextInt();
            DFS d = new DFS(n);
            for (int i = 0; i < n; i++)
                addEdge(sc.nextInt(), sc.nextInt());
            DFS(1, adj, vis);
            System.out.println();
        }
    }

    public static void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

    /*Complete the function below*/
    public static void DFS(int v, LinkedList<Integer> adj[], boolean visited[]) {
        // add code here.
        boolean flag = true;
        Stack<Integer> numbers = new Stack<Integer>();
        numbers.push(v);


        while (flag == true) {

            int current = numbers.pop();
            if (visited[current] == true) {
                if (numbers.size() == 0) {
                    flag = false;
                }
                continue;
            }
            visited[current] = true;
            System.out.print(current + " ");
            LinkedList<Integer> children = adj[current];
            int loop = children.size();
            for (int i = loop - 1; i >= 0; i--) {
                int child = children.get(i);
                if (!visited[child]) {
                    numbers.push(child);

                }
            }
            if (numbers.size() == 0) {
                flag = false;
            }


        }


    }
}