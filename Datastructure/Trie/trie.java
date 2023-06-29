package Trie;

public class trie {

    public static class Node {
        Node children[] = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
            this.eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int indx = word.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static boolean search(String words) {
        Node curr = root;
        for (int i = 0; i < words.length(); i++) {
            int indx = words.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                return false;
            } else {
                curr = curr.children[indx];
            }
        }
        return curr.eow == true;
    }

    public static void display(Node root, char[] str, int level) {
        Node curr = root;
        if (!curr.eow) {
            for (int k = level; k < str.length; k++)
                str[k] = 0;
            System.out.println(str);
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                str[level] = (char) (i + 'a');
                display(root.children[i], str, level + 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("the"));
        System.out.println(search("an"));
        int level = 0;
        char[] str = new char[26];

        // Displaying content of Trie
        System.out.println("Content of Trie: ");
        trie.display(root, str, level);
    }

}
