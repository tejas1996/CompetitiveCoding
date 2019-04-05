package algorithms.Graphs;

import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class DetectCyclic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer>[] grapth = formDirectedGraph();
        boolean[] visited = new boolean[100];
        boolean isCycyle = detectCycle(1, grapth, visited, 0);
        System.out.println(isCycyle);

    }

    private static boolean detectCycle(int i, LinkedList<Integer>[] grapth, boolean[] visited, int parent) {

        LinkedList<Integer> list = grapth[i];
        visited[i] = true;
        boolean flag = false;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) != parent && visited[list.get(j)]) {
                flag = true;
            }
        }
        if (flag == true) {
            return true;
        }

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) != parent) {
                flag = detectCycle(list.get(j), grapth, visited, i);
            }
        }
        if (flag == false) {
            return false;
        } else {
            return true;
        }


    }

    private static LinkedList<Integer>[] formDirectedGraph() {

        LinkedList<Integer>[] graph = new LinkedList[10];

        graph[0] = new LinkedList<Integer>();
        graph[1] = new LinkedList<Integer>();
        graph[2] = new LinkedList<Integer>();
        graph[3] = new LinkedList<Integer>();
        graph[4] = new LinkedList<Integer>();
        graph[5] = new LinkedList<Integer>();
        graph[6] = new LinkedList<Integer>();


        graph[1].add(2);
        graph[2].add(3);
        graph[3].add(4);
        graph[4].add(5);
        graph[5].add(6);
        graph[3].add(6);
        // repeat for bidirectional edges
        graph[2].add(1);
        graph[3].add(2);
        graph[4].add(3);
        graph[5].add(4);
        graph[6].add(5);
        graph[6].add(3);

        return graph;
    }


    // Graph will be
    /*

    1     4 ----- 5

    |     |       |

    2 --- 3 ------6

     */

}
