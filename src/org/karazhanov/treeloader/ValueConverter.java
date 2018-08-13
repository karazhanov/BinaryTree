package org.karazhanov.treeloader;

/**
 * @author karazhanov on 10.08.18.
 */
public interface ValueConverter<T extends Comparable, R> {
    T get(R value);
}
