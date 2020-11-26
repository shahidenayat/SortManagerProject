package com.sparta.shahid.binaryTree;

import com.sparta.shahid.exceptions.ChildNotFoundException;

public interface BinaryTree {

        int getRootElement();

        int getNumberOfElements();

        void addElement(int element);

        void addElements(int[] elements);

        boolean findElement(int value);

        int getLeftChild(int element) ;//throws ChildNotFoundException;

        int getRightChild(int element);

        int[] getSortedTreeAsc(); //in order traversal

        int[] getSortedTreeDesc();

}
