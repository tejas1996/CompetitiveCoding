package algorithms.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Codedo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        HashSet<Integer> removed = new HashSet<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            integers.add(number);
            if (number > max) {
                max = number;
            }
        }

        ArrayList<Integer> demo = new ArrayList<>(integers);
        for (int j = 0; j < n; j++) {
            int current = integers.get(j);
            if (max % current == 0 && !removed.contains(current)) {
                removed.add(current);
                demo.remove((Integer) integers.get(j));
            }
        }

        int max2 = 0;
        for (int j = 0; j < demo.size(); j++) {
            if (demo.get(j) > max2) {
                max2 = demo.get(j);
            }
        }
        System.out.println(max + " " + max2);


    }
}
