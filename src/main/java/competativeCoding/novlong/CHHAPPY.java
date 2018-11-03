package competativeCoding.novlong;

import java.util.*;

public class CHHAPPY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            HashMap<Integer, ArrayList<Integer>> hashmap = new HashMap<>();
            boolean flag = false;
            int count = 0;
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                if (hashmap.containsKey(number)) {
                    ArrayList list = hashmap.get(number);
                    list.add(i + 1);
                    hashmap.put(number, list);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i + 1);
                    hashmap.put(number, list);
                }
            }

            Iterator it = hashmap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                count = 0;
                ArrayList re = (ArrayList) pair.getValue();
                if (re.size() > 1) {
                    for (int i = 0; i < re.size(); i++) {
                        if (hashmap.containsKey(re.get(i))) {
                            count++;
                        }

                    }
                }
                if (count >= 2) {
                    flag = true;
                    break;
                }

            }

            if (flag) {
                System.out.println("Truly Happy");
            } else {
                System.out.println("Poor Chef");
            }

            t--;
        }
    }
}
