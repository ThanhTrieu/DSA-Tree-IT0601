package BalancedBinaryTree;

public class BalancedBinaryTree {
    public NodeBalanced root;

    // Check height balance
    public boolean checkHeightBalance(NodeBalanced root, Height height) {

        // Check for emptiness
        if (root == null) {
            height.height = 0;
            return true;
        }

        Height leftHeighteight = new Height(), rightHeighteight = new Height();
        boolean l = checkHeightBalance(root.left, leftHeighteight);
        boolean r = checkHeightBalance(root.right, rightHeighteight);
        int leftHeight = leftHeighteight.height, rightHeight = rightHeighteight.height;

        height.height = (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;

        if ((leftHeight - rightHeight >= 2) || (rightHeight - leftHeight >= 2))
            return false;

        else
            return l && r;
    }
}
