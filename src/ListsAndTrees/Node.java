package ListsAndTrees;

public class Node {
    int key; // gia tri tuong ung cua node
    public Node left; // node con ben trai
    public Node right; // node con ben phai

    // tao ra node root ban dau, chua co con
    public Node(int value){
        this.key = value;
        right = null;
        left = null;
    }
}
