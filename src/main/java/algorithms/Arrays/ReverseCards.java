package algorithms.Arrays;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// link to the problem - https://leetcode.com/problems/reveal-cards-in-increasing-order/

public class ReverseCards {
    public static void main(String[] args) {

        int[] input = {17, 13, 11, 2, 3, 5, 7};
        int[] ans = deckRevealedIncreasing(input);
        System.out.println(ans);

    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Deque<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);

        int[] ans = new int[N];
        Arrays.sort(deck);
        for (int card : deck) {
            ans[index.pollFirst()] = card;
            if (!index.isEmpty())
                index.add(index.pollFirst());
        }

        return ans;
    }
}

