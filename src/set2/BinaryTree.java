package set1;

import java.util.List;
import java.util.ArrayList;

public class BinaryTree {

    private BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(String str) {
        root = new BinaryTreeNode(str, null, null);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public List<String> flatten() {
        List<String> flattened = new ArrayList<String>();
        addNodesToFlattened(getRoot(), flattened);
        return flattened;
    }

    private void addNodesToFlattened(BinaryTreeNode current, List<String> flattened) {
        if (current != null) {
            flattened.add(current.getPayload());
            addNodesToFlattened(current.getLeft(), flattened);
            addNodesToFlattened(current.getRight(), flattened);
        }
    }

    public static void main( String [ ] args ) {
        BinaryTree t1 = new BinaryTree("1");
        BinaryTreeNode root = t1.getRoot();
        BinaryTreeNode n2 = new BinaryTreeNode("2", null, null);
        BinaryTreeNode n3 = new BinaryTreeNode("3", null, null);
        BinaryTreeNode n4 = new BinaryTreeNode("4", null, null);
        root.setLeft(n2);
        root.setRight(n3);
        n2.setLeft(n4);
        System.out.print("Tree nodes: ");
        System.out.println(t1.flatten());
    }
}
