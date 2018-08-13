package org.karazhanov.treeloader;

import org.karazhanov.tree.BinaryTree;

import java.util.Random;

/**
 * @author karazhanov on 10.08.18.
 */
public class TreeLoaderRandom<T extends Comparable<T>> implements TreeLoader<T> {

    private int elementsCount;
    private int maxValue;
    private ValueConverter<T, Integer> converter;

    public TreeLoaderRandom(int elementsCount, int maxValue, ValueConverter<T, Integer> converter) {
        this.elementsCount = elementsCount;
        this.maxValue = maxValue;
        this.converter = converter;
    }

    @Override
    public void load(BinaryTree<T> tree) {
        Random r = new Random();
        for (int i = 0; i < elementsCount; i++) {
            tree.add(converter.get(r.nextInt(maxValue)));
        }
    }
}
