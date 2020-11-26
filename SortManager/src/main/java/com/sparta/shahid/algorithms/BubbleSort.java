package com.sparta.shahid.algorithms;

public class BubbleSort implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {
        bubbleSort(arrayToSort);
        return arrayToSort;
    }

    public void bubbleSort(int array[]){
        if(array.length < 1){
            throw new IllegalArgumentException("Array must be of size greater than 0");
        }else {

            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < (array.length - i); j++) {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

    }
}
