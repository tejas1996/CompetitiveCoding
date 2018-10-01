package competativeCoding;

import java.util.*;

public class XORIER {

    HashMap<Integer, Integer> prime = new HashMap<>();

    static int myXOR(int x, int y) {
        return (x | y) &
                (~x | ~y);
    }

    public static void main(String[] args) {

        XORIER xorier = new XORIER();
        xorier.genPrime();

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int count = 0;
            int n = scanner.nextInt();
            int[] array = new int[100];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    int addi = myXOR(array[i], array[j]);

                    Iterator it = xorier.prime.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry hs = (Map.Entry) it.next();
                        int dif = addi - (Integer) hs.getKey();
                        if (xorier.prime.containsKey(dif)) {
                            if (dif % 2 == 0 && (Integer) hs.getKey() % 2 == 0) {
                                count++;
                                break;
                            } else if (dif % 2 == 1 && (Integer) hs.getKey() % 2 == 1) {
                                count++;
                                break;
                            }
                        }
                    }

                }
            }
            System.out.println(count);

            t--;
        }

    }

    void genPrime() {
        int max = 100000;

        for (int i = 2; i < max; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                prime.put(i, i);
            }
        }
    }


}
