package grab;


import javax.transaction.TransactionRequiredException;

public class Answer {

    static int max = 0;

    public static void main(String[] args) {

        Tree tree = formTree1();
        int ans = solution(tree);
        System.out.println((int) Math.pow(2, ans + 1) - 1);
    }

    public static int solution(Tree tree) {

        if (tree == null) {
            return 0;
        }
        if (tree.l == null && tree.r == null) {
            return 1;
        }
        int left = solution(tree.l);
        int right = solution(tree.r);

        int ret = 1 + Math.min(right, left);
        return ret;
    }


    private static Tree formTree1() {

        Tree root = new Tree(1);
        Tree two = new Tree(2);
        Tree four = new Tree(4);
        Tree three = new Tree(3);
        Tree five = new Tree(5);
        Tree seven = new Tree(7);
        Tree six = new Tree(6);
        Tree nine = new Tree(9);
        Tree ten = new Tree(10);
        Tree eight = new Tree(8);
        Tree ele = new Tree(11);
        root.l = two;
        two.r = four;
        root.r = three;
        three.l = five;
        five.l = seven;
        five.r = eight;
        three.r = six;
        six.l = nine;
        six.r = ten;
        ten.l = ele;


        return root;

    }
}
