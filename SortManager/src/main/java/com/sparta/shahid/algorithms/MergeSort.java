package com.sparta.shahid.algorithms;

public class MergeSort implements Sorter{


    @Override
    public int[] sortArray(int[] arrayToSort) {
        mergeSort(arrayToSort);
        return arrayToSort;
    }

    public static void mergeSort(int[] array) throws IllegalArgumentException {
        if(array.length < 1) {
            throw new IllegalArgumentException("Array cannot be of size 0 Please create an array of a size 1 or more");
        }
        if (array.length ==1 ){
            return;
        }

        int[] arrayA = new int[array.length/2];
        int[] arrayB = new int[array.length - array.length / 2];

        for (int i = 0; i < arrayA.length;i++){
            arrayA[i] = array[i];
        }
        for (int i = 0; i < arrayB.length;i++){
            arrayB[i] = array[arrayA.length+i];
        }


        mergeSort(arrayA);
        mergeSort(arrayB);
        mergeArray(array,arrayA,arrayB);



    }


    private static void mergeArray(int[] array,int[] arrayA, int[] arrayB){


        int i = 0; int j = 0; int k = 0;

        while (i < arrayA.length && j < arrayB.length){
            if(arrayA[i] < arrayB[j]){
                array[k] = arrayA[i];
                i++;
            }else{
                array[k] = arrayB[j];
                j++;
            }
            k++;
        }
        while (i < arrayA.length){
            array[k] = arrayA[i];
            i++;
            k++;
        }
        while(j < arrayB.length){
            array[k] = arrayB[j];
            j++;
            k++;
        }

    }


}
