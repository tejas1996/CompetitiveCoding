package competativeCoding.octlong;

import java.util.ArrayList;
import java.util.Scanner;

public class CLORGIRD {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            ArrayList<Pair> array = new ArrayList<>();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int flag = 0;

            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                String test = scanner.nextLine();
                for (int j = 0; j < m; j++) {

//                    String line = scanner.next();
//                    String[] spli = line.split(" ");
//

                    char text = test.charAt(j);
//                    scanner.nextLine();

                    if (text == '#') {
                        Pair pair = new Pair(i, j);
                        array.add(pair);
                    }

                }
            }


            for (int i = 0; i < array.size(); i++) {
                if (checkLeft(array.get(i), array, m, n) && checkRight(array.get(i), array, m, n) && checkTop(array.get(i), array, m, n) && checkBottom(array.get(i), array, m, n)) {

                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }


            t--;
        }


    }


    public static boolean checkLeft(Pair pair, ArrayList<Pair> array, int m, int n) {

        int x = pair.x - 1;
        int y = pair.y;

//        if(x-1 < 0){
//            return false;
//        }
//        if(y+1 >n){
//            return false;
//        }
//        if(y-1 < 0){
//            return false;
//        }
        Pair paitCheck = new Pair(x, y);
        if (array.contains(paitCheck)) {
            return true;
        }
        Pair a, b, c, d, e;
        a = new Pair(x, y + 1);
        b = new Pair(x - 1, y + 1);
        c = new Pair(x - 1, y);
        d = new Pair(x - 1, y - 1);
        e = new Pair(x, y - 1);

        if (array.contains(c)) {
            return false;
        }

        if (!array.contains(b) && !array.contains(a)) {
            return true;
        }
        if (!array.contains(d) && !array.contains(e)) {
            return true;
        }
        return false;
    }

    public static boolean checkRight(Pair pair, ArrayList<Pair> array, int m, int n) {

        int x = pair.x + 1;
        int y = pair.y;

//        if(x+1 > m){
//            return false;
//        }
//        if(y+1 >n){
//            return false;
//        }
//        if(y-1 < 0){
//            return false;
//        }
        Pair paitCheck = new Pair(x, y);
        if (array.contains(paitCheck)) {
            return true;
        }
        Pair a, b, c, d, e;
        a = new Pair(x, y + 1);
        b = new Pair(x + 1, y + 1);
        c = new Pair(x + 1, y);
        d = new Pair(x + 1, y - 1);
        e = new Pair(x, y - 1);

        if (array.contains(c)) {
            return false;
        }

        if (!array.contains(b) && !array.contains(a)) {
            return true;
        }
        if (!array.contains(d) && !array.contains(e)) {
            return true;
        }
        return false;
    }

    public static boolean checkTop(Pair pair, ArrayList<Pair> array, int m, int n) {

        int x = pair.x;
        int y = pair.y - 1;

//        if(x-1 < 0){
//            return false;
//        }
//        if(x+1 > m){
//            return false;
//        }
//        if(y-1 < 0){
//            return false;
//        }

        Pair paitCheck = new Pair(x, y);
        if (array.contains(paitCheck)) {
            return true;
        }
        Pair a, b, c, d, e;
        a = new Pair(x - 1, y);
        b = new Pair(x - 1, y - 1);
        c = new Pair(x, y + 1);
        d = new Pair(x + 1, y - 1);
        e = new Pair(x + 1, y);

        if (array.contains(c)) {
            return false;
        }

        if (!array.contains(b) && !array.contains(a)) {
            return true;
        }
        if (!array.contains(d) && !array.contains(e)) {
            return true;
        }
        return false;
    }

    public static boolean checkBottom(Pair pair, ArrayList<Pair> array, int m, int n) {

        int x = pair.x;
        int y = pair.y + 1;

//        if(x-1 < 0){
//            return false;
//        }
//        if(x+1 < m){
//            return false;
//        }
//
//        if(y+1 > n){
//            return false;
//        }

        Pair paitCheck = new Pair(x, y);
        if (array.contains(paitCheck)) {
            return true;
        }
        Pair a, b, c, d, e;
        a = new Pair(x - 1, y);
        b = new Pair(x - 1, y + 1);
        c = new Pair(x, y + 1);
        d = new Pair(x + 1, y + 1);
        e = new Pair(x + 1, y);

        if (array.contains(c)) {
            return false;
        }

        if (!array.contains(b) && !array.contains(a)) {
            return true;
        }
        if (!array.contains(d) && !array.contains(e)) {
            return true;
        }
        return false;
    }


}
