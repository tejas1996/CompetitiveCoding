package leetcode;

import java.util.HashMap;

// solution - https://leetcode.com/problems/implement-trie-prefix-tree/
class Trie {

    HashMap<Character, TrieObject> start = new HashMap<>();


    /**
     * Initialize your data structure here.
     */
    public Trie() {
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("appl");
        trie.insert("apple");
        System.out.println(trie.startsWith("app"));
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        HashMap lookup = start;
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (lookup.containsKey(current)) {
                TrieObject ob = (TrieObject) lookup.get(current);
                if (i == word.length() - 1) {
                    ob.isEnd = true;
                }
                lookup = ob.map;
            } else {
                TrieObject fresh = new TrieObject(word.charAt(i));
                if (i == word.length() - 1) {
                    fresh.isEnd = true;
                }
                lookup.put(word.charAt(i), fresh);
                TrieObject ob = (TrieObject) lookup.get(current);
                lookup = ob.map;
            }
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {

        HashMap lookup = start;
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (!lookup.containsKey(current)) {
                return false;
            } else {
                TrieObject ob = (TrieObject) lookup.get(current);
                if (i == word.length() - 1) {
                    if (ob.isEnd == true) {
                        return true;
                    } else {
                        return false;
                    }
                }
                lookup = ob.map;
            }
        }

        return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        HashMap lookup = start;
        for (int i = 0; i < prefix.length(); i++) {
            char current = prefix.charAt(i);
            if (!lookup.containsKey(current)) {
                return false;
            } else {
                TrieObject ob = (TrieObject) lookup.get(current);
                if (i == prefix.length() - 1) {
                    return true;
                }
                lookup = ob.map;
            }
        }

        return false;
    }

    class TrieObject {
        public HashMap<Character, TrieObject> map = new HashMap<>();
        char value;
        boolean isEnd = false;

        public TrieObject(char value) {
            this.value = value;
        }
    }
}
