package org.karazhanov.search;

import org.karazhanov.tree.BinaryTree;
import org.karazhanov.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author karazhanov on 10.08.18.
 */
public class SearchMinDepthPath<T extends Comparable<T>> {

    public Collection<SearchNode<T>> search(BinaryTree<T> tree) {
        if (tree.getRoot() == null) {
            return Collections.emptyList();
        }
        List<SearchNode<T>> list = searchDepth(tree.getRoot(), 1);
        Collections.reverse(list);
        return list;
    }

    private List<SearchNode<T>> searchDepth(TreeNode<T> root, int currentDepth) {
        List<SearchNode<T>> path = new ArrayList<>();
        if (root != null) {
            SearchNode<T> currentNode = new SearchNode<>(currentDepth, root.getValue());
            if (!root.isLeaf()) {
                List<SearchNode<T>> min = min(
                        searchDepth(root.getLeftNode(), currentDepth + 1),
                        searchDepth(root.getRightNode(), currentDepth + 1)
                );
                if (min != null) {
                    path.addAll(min);
                }
            }
            path.add(currentNode);
        }
        return path;
    }

    private List<SearchNode<T>> min(List<SearchNode<T>> value1, List<SearchNode<T>> value2) {
        List<SearchNode<T>> searchNodes = null;
        if (!value1.isEmpty() && !value2.isEmpty()) {
            searchNodes = value1.size() < value2.size() ? value1 : value2;
        }
        if (!value1.isEmpty()) {
            searchNodes = value1;
        } else {
            if (!value2.isEmpty()) {
                searchNodes = value2;
            }
        }
        return searchNodes;
    }
}
