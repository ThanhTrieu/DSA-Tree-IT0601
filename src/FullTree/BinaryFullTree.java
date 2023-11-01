package FullTree;

public class BinaryFullTree {
    public Node root;

    // Check for Full Binary Tree
    public boolean isFullBinaryTree(Node node) {
        // Checking tree emptiness
        if (node == null) {
            return true;
        }
        // Checking the children
        if (node.leftChild == null && node.rightChild == null) {
            return true;
        }

        if ((node.leftChild != null) && (node.rightChild != null)) {
            return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));
        }
        return false;
    }
}
