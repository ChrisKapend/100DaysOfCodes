package day2;

public class SelectionSort {
    public static void main(String [] args){
        int [] unsorted = {5, 2, 4, 6, 1, 3, 9}; //input : an unsorted array
        readArray(unsorted); //sorting the array
        selectionSort(unsorted); //sort the array in decreasing order
        readArray(unsorted);
    }
    static void selectionSort(int []A){
        for (int i =0; i < A.length; i++) {
            int low = i; // the lowest element's index at the beginning of the loop this value is equal to i which is the first element of the Array
            int j = i + 1; // second element index the one to which the lowest element is compared to
            for (; j < A.length; j++) {
                if(A[low] > A[j]){ //if the lowest element become greater than the current jth element then set that jth element as the lowest
                    low = j;
                }
            }
            //at the end of the inner loop the we've found the lowest element in the sub array [i . . . Array.length] we then swap it. The sub array [0 . . . i] is always sorted
            int swap = A[i];
            A[i] = A[low];
            A[low] = swap;
        }
    }
    static void readArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
