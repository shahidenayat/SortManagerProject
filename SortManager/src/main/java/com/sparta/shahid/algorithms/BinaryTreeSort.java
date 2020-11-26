package com.sparta.shahid.algorithms;

import com.sparta.shahid.binaryTree.BinaryTreeImplementation;

public class BinaryTreeSort implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation binaryTreeImplementation = new BinaryTreeImplementation(arrayToSort);
        return binaryTreeImplementation.getSortedTreeAsc();
    }
}
