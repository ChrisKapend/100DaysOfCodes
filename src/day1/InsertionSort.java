package day1;

import java.awt.event.KeyEvent;

public class InsertionSort {
    public static void main(String [] args){
        int [] unsorted = {5, 2, 4, 6, 1, 3, 9}; //input : an unsorted array
        readArray(unsorted); //sorting the array
        readArray(InsertionSort(unsorted)); //printing the sorted array
    }
    //Insertion sort
    static int [] InsertionSort(int [] keys){
        for(int i = 1; i<keys.length; i++){ //looping through each element of the array
            int current = keys[i]; //temp value needed to old the current element that need to be inserted at the right place
            int j = i - 1; //the insertion start at the second element of the array we need at least two element for comparison
            while ( j >=0 && current < keys[j] ){ //given that the left part of the array is always sorted we try to insert the ieth element at the right position. Check if that element is at the right position while we haven't reach the begining of the array
                keys[j + 1] = keys[j]; //if the current element is lower than the element at the current position move the current at the current position to the next one to make place
                j--; //reduce the value of the current position to reach the begining of the array
            }
            keys[j + 1] = current; //if we reach this position it means the current element is at the right position where it
        }
        return keys;
    }
    static void readArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
