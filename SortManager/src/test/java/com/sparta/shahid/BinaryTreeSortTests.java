package com.sparta.shahid;

import com.sparta.shahid.algorithms.BinaryTreeSort;
import com.sparta.shahid.binaryTree.BinaryTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class BinaryTreeSortTests
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void binaryTreeSortShouldSortSuccessfully(){
        int[] unsortedArray = new int[] {89,4,6,8,1};
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        int[] sortedArray = binaryTreeSort.sortArray(unsortedArray);
        for (int i = 1; i < sortedArray.length;i++){
            assert sortedArray[i] > sortedArray[i-1];
        }

    }


    @Test
    public void binaryTreeSortShouldThrowIae(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int[] unsortedArray = new int[] {};
            BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
            int[] sortedArray = binaryTreeSort.sortArray(unsortedArray);
        });


    }
}
