package competativeCoding.junCookOFF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DrinkSlush {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int i = 1; i <= m; i++) {
                int number = scanner.nextInt();
                hash.put(i, number);
            }

            int[] ans = new int[n];
            ArrayList<Integer> remain = new ArrayList<>();

            int money = 0;
            for (int i = 0; i < n; i++) {
                int drink = scanner.nextInt();
                int cor = scanner.nextInt();
                int wor = scanner.nextInt();

                if (hash.get(drink) > 0) {
                    money = money + cor;
                    ans[i] = drink;
                    hash.put(drink, hash.get(drink) - 1);
                } else {
                    money = money + wor;
                    remain.add(i);
                }
            }

            ArrayList<Integer> remianDrinks = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                if (hash.get(i) > 0) {
                    int number = hash.get(i);
                    for (int j = 0; j < number && remain.size() > 0; j++) {
                        ans[remain.get(0)] = i;
                        remain.remove(0);
                    }
                }
            }

            System.out.println(money);
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println("");
            t--;
        }
    }
}
