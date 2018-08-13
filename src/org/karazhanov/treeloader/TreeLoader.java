package org.karazhanov.treeloader;

import org.karazhanov.tree.BinaryTree;

/**
 * @author karazhanov on 10.08.18.
 */
public interface TreeLoader<T extends Comparable<T>> {
    void load(BinaryTree<T> tree);
}
