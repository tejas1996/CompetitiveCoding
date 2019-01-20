package algorithms.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EnergyBank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Long> numbers = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long number = scanner.nextInt();
            sum = sum + number;
            numbers.add(number);
        }

        long minimum = Long.MAX_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (sum - numbers.get(i) < minimum) {
                minimum = sum - numbers.get(i);
            }
        }
        if (minimum >= 0) {
            System.out.println(minimum);
        } else {
            System.out.println("0");
        }

    }
}
