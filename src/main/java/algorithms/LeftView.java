package algorithms;

import competativeCoding.Node;

import java.util.HashMap;
import java.util.Scanner;

public class LeftView {


    public static void main(String args[]) {
        Node node = new Node(5);
        leftView(node);

    }

    public static void leftView(Node root) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Node> hashMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    int start = sc.nextInt();
                    root.item = start;
                    hashMap.put(start, root);
                    int newNode = sc.nextInt();
                    char dir = sc.nextLine().charAt(1);
                    Node node = new Node(newNode);
                    hashMap.put(newNode, node);
                    if (dir == 'R') {
                        root.right = node;
                    } else {
                        root.left = node;
                    }

                } else {
                    int start = sc.nextInt();
                    int newNode = sc.nextInt();
                    char dir = sc.nextLine().charAt(1);
                    Node node = new Node(newNode);
                    hashMap.put(newNode, node);
                    Node parent = hashMap.get(start);
                    if (dir == 'R') {
                        parent.right = node;
                    } else {
                        parent.left = node;
                    }

                }

            }


            t--;
        }

    }


}
