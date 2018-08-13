package org.karazhanov.search;

/**
 * @author karazhanov on 10.08.18.
 */
public class SearchNode<T> {
    private int depth;
    private T value;

    public SearchNode(int depth, T value) {
        this.depth = depth;
        this.value = value;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
