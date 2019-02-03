package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ArrayManioulation {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        int[] integers = new int[n + 1];
        for (int i = 0; i < queries.length; i++) {
            integers[queries[i][0]] = integers[queries[i][0]] + queries[i][2];
            if (queries[i][1] + 1 < n) {
                integers[queries[i][1]] = integers[queries[i][1]] - queries[i][2];
            }


        }
        int max = 0, current = integers[0];
        for (int i = 1; i < n; i++) {
            integers[i] = integers[i] + current;
            System.out.print(integers[i] + " ");
            current = integers[i];

            if (integers[i] > max) {
                max = integers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
