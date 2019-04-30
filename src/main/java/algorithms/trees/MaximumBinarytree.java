package algorithms.trees;

import java.util.Scanner;


// problem link = https://leetcode.com/problems/maximum-binary-tree/

public class MaximumBinarytree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tuple[] tuples = new Tuple[100];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            tuples[i] = new Tuple(number, i);
        }
        // sorting
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (tuples[i].number < tuples[j].number) {
                    Tuple temp = tuples[j];
                    tuples[j] = tuples[i];
                    tuples[i] = temp;
                }

            }
        }
        Node ans = dotheThing(tuples, n);
        System.out.println("done");


    }

    private static Node dotheThing(Tuple[] tuples, int n) {

        if (tuples == null || n == 0) {
            return null;
        }
        Node node = new Node(tuples[0].number);
        Tuple[] left = new Tuple[100];
        int leftIndex = 0, rightIndex = 0;
        Tuple[] right = new Tuple[100];
        for (int i = 0; i < n; i++) {
            if (tuples[i].position < tuples[0].position) {
                left[leftIndex] = tuples[i];
                leftIndex++;
            } else if (tuples[i].position > tuples[0].position) {
                right[rightIndex] = tuples[i];
                rightIndex++;
            }
        }

        node.left = dotheThing(left, leftIndex);
        node.right = dotheThing(right, rightIndex);

        return node;
    }


    public static class Tuple {

        int number, position;

        public Tuple(int number, int position) {
            this.number = number;
            this.position = position;
        }
    }
}


