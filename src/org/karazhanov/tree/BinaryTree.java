package org.karazhanov.tree;

/**
 * @author karazhanov on 10.08.18.
 */
public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public void add(T value) {
        TreeNode<T> valueNode = new TreeNode<>(value);
        if (root == null) {
            root = valueNode;
        } else {
            TreeNode<T> tmp = root;
            while (true) {
                if (value.compareTo(tmp.getValue()) < 0) {
                    if (tmp.getLeftNode() == null) {
                        tmp.setLeftNode(valueNode);
                        return;
                    } else {
                        tmp = tmp.getLeftNode();
                    }
                } else {
                    if (tmp.getRightNode() == null) {
                        tmp.setRightNode(valueNode);
                        return;
                    } else {
                        tmp = tmp.getRightNode();
                    }
                }
            }
        }
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public String treeToString() {
        return "ROOT = " + root.getValue() + " \n" + treeToString(root);
    }

    private String treeToString(TreeNode<T> root) {
        if(root == null) {
            return "-";
        }
        String leftSubTree = treeToString(root.getLeftNode());
        String rightSubTree = treeToString(root.getRightNode());
        return "(" + leftSubTree + root.getValue() + rightSubTree + ")";
    }

    @Override
    public String toString() {
        return root == null ? "EMPRY" : root.toString();
    }
}
