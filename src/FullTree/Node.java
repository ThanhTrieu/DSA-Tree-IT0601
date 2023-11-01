package FullTree;

public class Node {
    // tao node cho cay nhi phan day du
    int data;
    public Node leftChild;
    public Node rightChild;

    public Node(int item) {
        data = item;
        leftChild = rightChild = null;
    }
}
