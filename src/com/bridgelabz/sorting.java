package com.bridgelabz;

public class sorting {


    public static void main(String[] args) {

        int[] array = {2, 9, 6, 3};
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // using temp variable array i compare to temp and the value is assign into this
        // after while using loop for j compare that temp is equal to j
        // assign
        System.out.println("elements of array in descending");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i<array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.println("elements of array in descending");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}