package com.sparta.shahid;

import com.sparta.shahid.algorithms.BinaryTreeSort;
import com.sparta.shahid.algorithms.BubbleSort;
import com.sparta.shahid.algorithms.MergeSort;
import com.sparta.shahid.algorithms.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Tests {
    Sorter bubbleSorter = new BubbleSort();
    Sorter mergeSorter = new MergeSort();
    Sorter binarySorter = new BinaryTreeSort();

    @Test
    public void test(){
        int[] array1 = {17, 76, 98, 2, 5, 33};
        int[] array1Sorted = {2, 5, 17, 33, 76, 98};

        Assertions.assertArrayEquals(array1Sorted,bubbleSorter.sortArray(array1));
        Assertions.assertArrayEquals(array1Sorted,binarySorter.sortArray(array1));
        Assertions.assertArrayEquals(array1Sorted,mergeSorter.sortArray(array1));
    }
}
