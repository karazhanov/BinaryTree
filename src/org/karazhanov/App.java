package org.karazhanov;

import org.karazhanov.search.SearchMinDepthPath;
import org.karazhanov.search.SearchNode;
import org.karazhanov.tree.BinaryTree;
import org.karazhanov.treeloader.TreeLoader;
import org.karazhanov.treeloader.TreeLoaderMock;
import org.karazhanov.treeloader.TreeLoaderRandom;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author karazhanov on 10.08.18.
 */
public class App {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
//        TreeLoader<Integer> treeLoader = new TreeLoaderRandom<>(10, 50, value -> value);
        TreeLoader<Integer> treeLoader = new TreeLoaderMock<>(Arrays.asList(9, 5, 9, 3, 7, 1, 4, 8, 12, 11,13, 10, 11, 14));
        treeLoader.load(tree);
        System.out.println(tree.toString());
        SearchMinDepthPath<Integer> searchMinDepthPath = new SearchMinDepthPath<>();
        Collection<SearchNode<Integer>> path = searchMinDepthPath.search(tree);
        System.out.println(path);
    }
}
