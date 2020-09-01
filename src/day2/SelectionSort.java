package day2;

public class SelectionSort {
    public static void main(String [] args){
        int [] unsorted = {5, 2, 4, 6, 1, 3, 9}, sorted = {1, 2, 4, 5, 6, 7, 8}; //input : an unsorted array
        readArray(unsorted); //sorting the array
        readArray(selectionSort(unsorted)); //sort the array in decreasing order
        readArray(selectionSort(sorted));
    }
    static int [] selectionSort(int []A){
        for (int i =0; i < A.length; i++) {
            int low = i;
            int j = i + 1;
            for (; j < A.length; j++) {
                if(A[low] > A[j]){
                    low = j;
                }
            }
            int swap = A[i];
            A[i] = A[low];
            A[low] = swap;
        }
        return A;
    }
    static void readArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
