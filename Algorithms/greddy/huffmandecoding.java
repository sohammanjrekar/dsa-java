package Algorithms.greddy;

import java.util.*;
import java.util.Map.Entry;

public class huffmandecoding {

    private static Map<Character, String> codes = new HashMap<>();
    private static Map<Character, Integer> freq = new HashMap<>();
    private static PriorityQueue<MinHeapNode> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String encodedString = "";
        String decodedString = "";
        calcFreq(str);
        HuffmanCodes(str.length());
        System.out.println("Character With their Frequencies:");
        for (Entry<Character, String> entry : codes.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (char c : str.toCharArray()) {
            encodedString += codes.get(c);
        }
        System.out.println("\nEncoded Huffman data:");
        System.out.println(encodedString);
        decodedString = decodeFile(minHeap.peek(), encodedString);
        System.out.println("\nDecoded Huffman Data:");
        System.out.println(decodedString);
    }

    private static void HuffmanCodes(int size) {
        for (Entry<Character, Integer> entry : freq.entrySet()) {
            minHeap.add(new MinHeapNode(entry.getKey(), entry.getValue()));
        }
        while (minHeap.size() != 1) {
            MinHeapNode left = minHeap.poll();
            MinHeapNode right = minHeap.poll();
            MinHeapNode top = new MinHeapNode('$', left.freq + right.freq);
            top.left = left;
            top.right = right;
            minHeap.add(top);
        }
        storeCodes(minHeap.peek(), "");
    }

    private static void calcFreq(String str) {
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
    }

    private static void storeCodes(MinHeapNode root, String str) {
        if (root == null) {
            return;
        }
        if (root.data != '$') {
            codes.put(root.data, str);
        }
        storeCodes(root.left, str + "0");
        storeCodes(root.right, str + "1");
    }

    private static String decodeFile(MinHeapNode root, String s) {
        String ans = "";
        MinHeapNode curr = root;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
            if (curr.left == null && curr.right == null) {
                ans += curr.data;
                curr = root;
            }
        }
        return ans + '\0';
    }

}

class MinHeapNode implements Comparable<MinHeapNode> {
    char data;
    int freq;
    MinHeapNode left, right;

    MinHeapNode(char data, int freq) {
        this.data = data;
        this.freq = freq;
    }

    public int compareTo(MinHeapNode other) {
        return this.freq - other.freq;
    }
}
// Time complexity:

// Time complexity of the Huffman coding algorithm is O(n log n), where n is the
// number of characters in the input string. The auxiliary space complexity is
// also O(n), where n is the number of characters in the input string.

// In the given C++ implementation, the time complexity is dominated by the
// creation of the Huffman tree using the priority queue, which takes O(n log n)
// time. The space complexity is dominated by the maps used to store the
// frequency and codes of characters, which take O(n) space. The recursive
// functions used to print codes and store codes also contribute to the space
// complexity.