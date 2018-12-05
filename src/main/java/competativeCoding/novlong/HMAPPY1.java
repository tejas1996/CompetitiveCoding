package competativeCoding.novlong;

import java.util.Scanner;

public class HMAPPY1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[100007];
        char[] queries = new char[300007];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        String query = scanner.next();
        for (int i = 0; i < query.length(); i++) {
            queries[i] = query.charAt(i);
        }
        int start = 0;
        Tuple tuple = null;
        boolean flag = true;
        int begin = 0, finish = 0;
        for (int i = 0; i < queries.length; i++) {

            if (queries[i] == '?') {
                if (flag == false) {
                    System.out.println(tuple.max);
                } else {
                    tuple = calculate(array, start, n - 1, k);
                    begin = tuple.start;
                    finish = tuple.end;
                    System.out.println(tuple.max);
                    flag = false;
                }
            } else {
                if (start == 0) {
                    start = n - 1;
                } else {
                    start--;
                }
                if (start == finish) {
                    flag = true;
                } else if (array[start] == 1) {
                    if (tuple.max != k) {
                        tuple.max++;
                        tuple.start = start;
                        if (tuple.end == 0) {
                            tuple.end = n;
                        } else {
                            tuple.end--;
                        }
                    }
                }
            }
        }

    }

    private static Tuple calculate(int[] array, int start, int end, int k) {

        int max = 0, count = 0;
        int begin = 0;
        int finbegin = 0, finfinish = 0;
        int endpart = 0;
        if (start == 0) {
            endpart = 0;
        } else {
            endpart = start;
        }
        do {

            if (count == 0) {
                begin = start;
            }
            if (array[start] == 1) {
                count++;
                if (count > max) {
                    max = count;
                    finbegin = begin;
                    finfinish = start;
                    if (count == k) {
                        break;
                    }
                }
            } else {
                count = 0;
            }


            if (start == end) {
                start = 0;
            } else {
                start++;
            }
        } while (start != endpart);
        Tuple tuple = new Tuple(finbegin, finfinish, max);
        return tuple;

    }

}
