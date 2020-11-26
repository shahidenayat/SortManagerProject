package com.sparta.shahid.views;

import java.util.*;

public class InputManager {

    public static int scanForChoice(){

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println(
                    "Sort Manager - Please select your desired sorting algorithm"
                            + "\n 1. Binary Sort"
                            + "\n 2. Bubble Sort"
                            + "\n 3. Merge Sort"
                            + "\n Your Choice of an Algorithm: ");


            try {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 3) {
                    throw new IllegalArgumentException("Please choose a number between 1 and 3" );
                }
            } catch (Exception e) {
                choice = 0;
                scanner.nextLine();
                System.out.println(e.getMessage());
            }
        } while (choice == 0);

        return choice;
    }

    public static int scanForLengthOfArray(){

        Scanner scanner = new Scanner(System.in);
        int arrayChoice;

        do{
            System.out.println(
                    "Sort Manager - Please select your array size" +
                            "\n choose from max size allowed = 100");


            try{
                arrayChoice = scanner.nextInt();
                if (arrayChoice <= 0) {
                    throw new IllegalArgumentException("Array length can not be less than or equal to zero" +
                            " \nPlease input a number greater than zero.");
                }
            } catch (Exception e) {
                arrayChoice = 0;
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
            arrayChoice = Math.min(arrayChoice, 100); // max array size allowed is 100

        } while (arrayChoice < 1);

        return arrayChoice;
    }

    public static int[] arrayRandomizer(int arrayLength){
        Random rand = new Random();
        Set<Integer> numberGen = new LinkedHashSet<Integer>();
        while(numberGen.size() < arrayLength){
            Integer next = rand.nextInt(100);
            numberGen.add(next);
        }
        int[] Array = new int[arrayLength];
        int index = 0;
        for(int number : numberGen) {
            Array[index++] = number;
        }

        return Array;
    }


}
