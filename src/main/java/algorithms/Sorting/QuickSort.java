package algorithms.Sorting;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] integers = new int[100];
        for (int i = 0; i < n; i++) {
            integers[i] = sc.nextInt();
        }

        integers[n] = Integer.MAX_VALUE;
        quickSort(0, n, integers);

    }

    private static void quickSort(int start, int end, int[] integers) {

        int pivot = start;
        int i = start + 1;
        int j = end - 1;
        int compare = integers[pivot];
        while (i < j) {
            while (integers[i] < compare) {
                i++;
            }
            while (integers[j] > compare) {
                j--;
            }
            if (i < j) {
                int temp = integers[i];
                integers[i] = integers[j];
                integers[j] = temp;
            }
            if (j > 0) {
                int temp = integers[start];
                integers[start] = integers[j];
                integers[j] = temp;
            }

            quickSort(start, j - 1, integers);
            quickSort(j + 1, end, integers);

        }
        System.out.println("done");

    }
}
