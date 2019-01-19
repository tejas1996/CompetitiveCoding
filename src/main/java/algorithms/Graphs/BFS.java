package algorithms.Graphs;

import java.io.*;
import java.util.*;

class BFS {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[10001];
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < 10001; i++)
                adj[i] = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                adj[a].add(b);
            }
            //int s=sc.nextInt();
            boolean vis[] = new boolean[1001];
            for (int i = 0; i < 1001; i++)
                vis[i] = false;
            bfs(1, adj, vis);
            System.out.println();
        }
    }
 

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


    // Complete this function
    public static void bfs(int s, ArrayList<Integer> adj[], boolean visited[]) {
        //Add your code here.
        boolean flag = true;
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.push(s);


        while (flag == true) {

            int current = numbers.pollFirst();
            if (visited[current] == true) {
                if (numbers.size() == 0) {
                    flag = false;
                }
                continue;
            }
            visited[current] = true;
            System.out.print(current + " ");
            ArrayList<Integer> children = adj[current];
            int loop = children.size();
            for (int i = 0; i < loop; i++) {
                int child = children.get(i);
                if (!visited[child]) {
                    numbers.add(child);

                }
            }
            if (numbers.size() == 0) {
                flag = false;
            }


        }


    }
}