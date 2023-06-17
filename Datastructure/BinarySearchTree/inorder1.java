package BinarySearchTree;

// Class describing a node of tree
class Node {

    int data;
    Node left;
    Node right;

    Node(int v) {
        this.data = v;
        this.left = this.right = null;
    }
}

class inorder1 {
    // Inorder Traversal
    public static void printInorder(Node node) {
        if (node == null)
            return;

        // Traverse left subtree
        printInorder(node.left);

        // Visit node
        System.out.print(node.data + " ");

        // Traverse right subtree
        printInorder(node.right);
    }

    // Driver Code
    public static void main(String[] args) {
        // Build the tree
        Node root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(200);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(150);
        root.right.right = new Node(300);

        // Function call
        System.out.print("Inorder Traversal: ");
        printInorder(root);
    }
}
