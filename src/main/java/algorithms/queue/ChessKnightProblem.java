package algorithms.queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ChessKnightProblem {
    public static void main(String[] args) {
        int x, y, a, b;
        x = 0;
        y = 7;
        a = 7;
        b = 0;

        Tuple start = new Tuple(x, y);
        Tuple end = new Tuple(a, b);
        int ans = findMinSteps(start, end);
        System.out.println(ans);
    }

    private static int findMinSteps(Tuple start, Tuple end) {

        HashSet<Tuple> visited = new HashSet<>();
        int count = 0;
        if (start.equals(end)) {
            return 0;
        }

        Queue<Tuple> queue = new LinkedList<>();
        queue.add(start);
        queue.add(new Tuple(-1, -1));

        while (!queue.isEmpty()) {

            Tuple current = queue.poll();
            if (current.x == -1 && current.y == -1) {
                count++;
                queue.add(new Tuple(-1, -1));
            }
            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);
            if (current.equals(end)) {
                return count;
            }
            ArrayList<Tuple> allPoss = findAllPoss(current);
            for (int i = 0; i < allPoss.size(); i++) {
                queue.add(allPoss.get(i));
            }

        }
        return count;
    }

    private static ArrayList<Tuple> findAllPoss(Tuple current) {
        int x = current.x;
        int y = current.y;
        ArrayList<Tuple> ans = new ArrayList<>();
        if (x + 1 < 8 && y + 2 < 8) {
            ans.add(new Tuple(x + 1, y + 2));
        }
        if (x + 1 < 8 && y - 2 >= 0) {
            ans.add(new Tuple(x + 1, y - 2));
        }
        if (x - 1 >= 0 && y + 2 < 8) {
            ans.add(new Tuple(x - 1, y + 2));
        }
        if (x - 1 >= 0 && y - 2 >= 0) {
            ans.add(new Tuple(x - 1, y - 2));
        }
        if (x + 2 < 8 && y + 1 < 8) {
            ans.add(new Tuple(x + 2, y + 1));
        }
        if (x + 2 < 8 && y - 1 >= 0) {
            ans.add(new Tuple(x + 2, y - 1));
        }
        if (x - 2 >= 0 && y + 1 < 8) {
            ans.add(new Tuple(x - 2, y + 1));
        }
        if (x - 2 >= 0 && y - 1 >= 0) {
            ans.add(new Tuple(x - 2, y - 1));
        }
        return ans;
    }
}
