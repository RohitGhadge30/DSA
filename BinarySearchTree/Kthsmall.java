public class Kthsmall{
    
    // Inner class representing a node in the BST
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int k=2;

    // Method to find the kth smallest element in a BST
    public static Node kthsmall(Node root) {
        if (root == null) {
            return null;
        }

        // Traverse left subtree to find the kth smallest element
        Node left = kthsmall(root.left);
        if (left != null) {
            return left;
        }

        // Decrement k after traversing left subtree
        k--;

        // If k becomes 0, return the current node
        if (k == 0) {
            return root;
        }

        // Traverse right subtree to find the kth smallest element
        return kthsmall(root.right);
    }

    public static void main(String[] args) {
        // Create a sample BST
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);


       
        Node kthSmallestNode = kthsmall(root);
        if (kthSmallestNode != null) {
            System.out.println("The " + k + "th smallest element in the BST is: " + kthSmallestNode.data);
        } else {
            System.out.println("No such element found.");
        }
    }
}