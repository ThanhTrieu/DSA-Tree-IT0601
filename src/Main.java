//import CompleteBinaryTree.CompleteBinaryTree;
//import CompleteBinaryTree.Node;
//import FullTree.BinaryFullTree;
//import ListsAndTrees.ArrayListsADT;
//import ListsAndTrees.BinaryTree;
//import ListsAndTrees.Node;
//import FullTree.Node;
//import PerfectBinaryTree.PerfectBinaryTree;

//import java.util.ArrayList;
//import java.util.List;
import BalancedBinaryTree.Height;
import BalancedBinaryTree.NodeBalanced;
import BalancedBinaryTree.BalancedBinaryTree;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        // Array List
//        List<String> listStr = new ArrayList<>();
//        ArrayListsADT arrayListsADT = new ArrayListsADT(listStr);
//        // add list
//        arrayListsADT.addElementToArrayList();
//        arrayListsADT.addAllElement();
//        arrayListsADT.getElement(3);
//        arrayListsADT.changeValueElement(3, "Cat");
//        arrayListsADT.removeElement(3);
//        arrayListsADT.throughArrayList();
//        arrayListsADT.getSize();
//        arrayListsADT.findElement("09", 1);
//        arrayListsADT.removeAllElement();
//        arrayListsADT.changeToArray();
//        arrayListsADT.clearLists();

//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        System.out.print("Pre order Traversal: ");
//        tree.traversePreOrder(tree.root);
//        System.out.print("\nIn order Traversal: ");
//        tree.traverseInOrder(tree.root);
//        System.out.print("\nPost order Traversal: ");
//        tree.traversePostOrder(tree.root);

//        BinaryFullTree tree = new BinaryFullTree();
//        tree.root = new Node(1);
//        tree.root.leftChild = new Node(2);
//        tree.root.rightChild = new Node(3);
//        tree.root.leftChild.leftChild = new Node(4);
//        tree.root.leftChild.rightChild = new Node(5);
//        tree.root.rightChild.leftChild = new Node(6);
//        tree.root.rightChild.rightChild = new Node(7);
//        //tree.root.rightChild.rightChild = new Node(8);
//
//        if (tree.isFullBinaryTree(tree.root)) {
//            System.out.print("The tree is a full binary tree");
//        } else {
//            System.out.print("The tree is not a full binary tree");
//        }

//        PerfectBinaryTree.Node root = null;
//        root = PerfectBinaryTree.newNode(1);
//        root.left = PerfectBinaryTree.newNode(2);
//        root.right = PerfectBinaryTree.newNode(3);
//        root.left.left = PerfectBinaryTree.newNode(4);
//        root.left.right = PerfectBinaryTree.newNode(5);
//        root.right.right = PerfectBinaryTree.newNode(6);
//        root.right.left = PerfectBinaryTree.newNode(7);
//
//        if (PerfectBinaryTree.is_Perfect(root))
//            System.out.println("The tree is a perfect binary tree");
//        else
//            System.out.println("The tree is not a perfect binary tree");

//        CompleteBinaryTree tree = new CompleteBinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.right = new Node(5);
//        tree.root.left.left = new Node(4);
//        tree.root.right.left = new Node(6);
//        int node_count = tree.countNumNodes(tree.root);
//        int index = 0;
//        if (tree.checkComplete(tree.root, index, node_count))
//            System.out.println("The tree is a complete binary tree");
//        else
//            System.out.println("The tree is not a complete binary tree");
        Height height = new Height();
        BalancedBinaryTree tree = new BalancedBinaryTree();
        tree.root = new NodeBalanced(1);
        tree.root.left = new NodeBalanced(2);
        tree.root.right = new NodeBalanced(3);
        tree.root.left.left = new NodeBalanced(4);
        tree.root.left.right = new NodeBalanced(5);
        tree.root.left.right.left = new NodeBalanced(6);
        tree.root.left.right.left.left = new NodeBalanced(7);
        tree.root.left.right.left.left.left = new NodeBalanced(8);

        if (tree.checkHeightBalance(tree.root, height))
            System.out.println("The tree is balanced");
        else
            System.out.println("The tree is not balanced");
    }
}