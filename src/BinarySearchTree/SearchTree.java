package BinarySearchTree;

public class SearchTree {
    public BuildNode root;
    public SearchTree(){
        root = null;
    }
    // insert cac node vao cay nhi phan
    public BuildNode insert(BuildNode node, int key){
        if(node == null){
            node = new BuildNode(key);
            return node;
        }
        if(key < node.key){
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }
        return node;
    }

    // delete node trong cay nhi phan
    public BuildNode delete(BuildNode root, int key){
        if(root == null){
            return root;
        }
        if(root.key > key){
            root.left = delete(root.left, key);
            return root;
        } else if(root.key < key) {
            root.right = delete(root.right, key);
            return root;
        }

        if(root.left == null){
            BuildNode temp = root.right;
            return temp;
        } else if(root.right == null){
            BuildNode temp = root.left;
            return temp;
        } else {
            BuildNode successParent = root;
            BuildNode success = root.right;
            while (success.left != null){
                successParent = success;
                success = success.left;
            }
            if(successParent != root){
                successParent.left = success.right;
            } else {
                successParent.right = success.left;
            }
            root.key = success.key;
            return root;
        }
    }

    public void inorder(BuildNode root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.key + "  ");
            inorder(root.right);
        }
    }

    // tim kiem node trong cay nhi phan
    public BuildNode search(BuildNode root, int key){
        if(root == null || root.key == key){
            return root;
        }
        if(root.key < key){
            // tim cac cay nhi phan ben phai
            return search(root.right, key);
        } else {
            // goi lai chinh ham do trong ham - de quy
            // tim cac cay nhi phan ben trai
            return search(root.left, key);
        }
    }
}
