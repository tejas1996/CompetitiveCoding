package competativeCoding.janlunch;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Tetst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList();
            for (int i = 0; i < n; i++) {
                arrayList.add(sc.nextInt());
            }
            boolean flag = false;
            int digits = 1;
            Stack stack = new Stack();
            int current = arrayList.get(arrayList.size() - 1);
            stack.push(current);
            while (flag == false) {
                current = arrayList.get(arrayList.size() - digits - 1);
                if (current < (int) stack.peek()) {
                    flag = true;
                } else {
                    stack.push(current);
                }
                digits++;

            }

            int siz = arrayList.size();
            for (int i = arrayList.size() - digits + 1; i < siz; i++) {
                int number = arrayList.get(i);
                if (number < current) {
                    arrayList.add(i - 1, number);
                } else {
                    int temp = arrayList.get(i - 1);
                    arrayList.add(i - 1, current);
                    for (int j = i; j < siz; j++) {
                        int temp2 = arrayList.get(j);
                        arrayList.add(j, temp);
                        temp = temp2;

                    }
                }

            }
            arrayList.add(arrayList.size() - 1, current);

            for (int i = 0; i < arrayList.size(); i++) {

                System.out.print(arrayList.get(i));

            }
            System.out.println();


            t--;
        }

    }
}
