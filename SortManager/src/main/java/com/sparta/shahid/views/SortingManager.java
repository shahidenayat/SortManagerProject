package com.sparta.shahid.views;

import com.sparta.shahid.algorithms.BinaryTreeSort;
import com.sparta.shahid.algorithms.BubbleSort;
import com.sparta.shahid.algorithms.MergeSort;
import com.sparta.shahid.algorithms.Sorter;

public class SortingManager {
    private static Sorter getNumberOfSort(int option) {
        switch (option) {
            case 1:
                return new BinaryTreeSort();
            case 2:
                return new BubbleSort();
            case 3:
                return new MergeSort();
            default:
                return null;

        }

    }

    public static String getNameOfSort(int option){
        switch (option){
            case 1:
                return "Binary Tree Sort";
            case 2:
                return "Bubble Sort";
            case 3:
                return "Merge Sort";
            default:
                return null;
        }
    }
    public static int[] callChosenSorter(int option, int[] array){
        Sorter sorter = getNumberOfSort(option);
        return sorter.sortArray(array);
    }


}
