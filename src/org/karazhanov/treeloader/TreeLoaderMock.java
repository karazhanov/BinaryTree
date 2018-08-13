package org.karazhanov.treeloader;

import org.karazhanov.tree.BinaryTree;

import java.util.Collection;

/**
 * @author karazhanov on 10.08.18.
 */
public class TreeLoaderMock<T extends Comparable<T>> implements TreeLoader<T> {

    private Collection<T> mockData;

    public TreeLoaderMock(Collection<T> mockData) {
        this.mockData = mockData;
    }

    @Override
    public void load(BinaryTree<T> tree) {
        mockData.forEach(tree::add);
    }
}
