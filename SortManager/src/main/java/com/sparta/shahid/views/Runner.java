package com.sparta.shahid.views;

import java.util.Arrays;

public class Runner {

    public static void start(){

        int lengthOfArray = 100;
        int algChoice = InputManager.scanForChoice();


        lengthOfArray = InputManager.scanForLengthOfArray();
        int[] randomizedArray = InputManager.arrayRandomizer(lengthOfArray);
        String nameOfAlgorithm = SortingManager.getNameOfSort(algChoice);
        System.out.println("Sorting using " + nameOfAlgorithm);
        System.out.println("Original array: " + Arrays.toString(randomizedArray));
        int[] sortedArray = SortingManager.callChosenSorter(algChoice,randomizedArray);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

    }
}
