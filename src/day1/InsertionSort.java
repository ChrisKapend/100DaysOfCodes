package day1;

public class InsertionSort {
    public static void main(String [] args){
        int [] unsorted = {5, 2, 4, 6, 1, 3, 9}; //input : an unsorted array
        readArray(unsorted); //sorting the array
        readArray(InsertionSortIncreasing(unsorted, true)); //sort the array in increasing order
        readArray(InsertionSortIncreasing(unsorted, false)); //sort the array in decreasing order
    }

    //Insertion sort decreasing
    static int [] InsertionSortIncreasing(int A [], boolean increasing){
        //first loop traverse the whole array from start to the end
        for (int i = 1; i < A.length; i++) { //always start at 1 because the single element subarray is always sorted
            int current = A[i]; //the current element in the array, the sub array A[0..i]is always sorted
            //j is one element less than i to allow comparison to be made between the two elements
            int j = i - 1; //second loop runner traverse the subarray A[0..i] to find a best position for the A[i] element
            if(increasing){ //when true the array is sorted in increasing order
                while(j >= 0 && current < A[j]){//increasing order sort
                    A[j+1] = A[j];
                    j--;
                }
                A[j+1]=current;
            }
            else{
                while(j >= 0 && current > A[j]){//decreasing order
                    A[j+1] = A[j];
                    j--;
                }
                A[j+1]=current;
            }
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
