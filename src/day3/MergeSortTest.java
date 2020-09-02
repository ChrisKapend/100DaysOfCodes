package day3;

import java.util.Arrays;

public class MergeSortTest{
    public static void main(String args[]){//program tester
        //Merge Test of two ordered part of an array
        System.out.println("Merging the two ordered sub array 2, 4, 5, 7 and 1, 2, 3, 6, 14 ");
        Integer a [] = {15, 2, 4, 5, 7, 1, 2, 3, 6, 14, 89, 10};
        display(a);
        merge(a, 1, 4, 9);
        display(a);
        //MergeSort test
        System.out.println("");
        System.out.println("Sorting from index 0 to index 7 or the 8 first element" );
        display(a);
        mergeSort(a, 0, 7);
        display(a);
    }
    static  <T extends Comparable <T>> void merge(T array [], int a1s, int a1e, int a2e){
        //a1s, a1e and a2e are indices respectively marking where the first array start and end and where
        //the second one finish. the two sub array are considered to be contingent
//        //step 1 create two arrays //in a classic way the two following lines can be replaced by two for loops copying each element
//        T subarray1 [] = a1s < a1e ? Arrays.copyOfRange(array, a1s, a1e + 1) : Arrays.copyOfRange(array, a1s, a1e + 1);
//        T subarray2 [] = a1e < a1s ? Arrays.copyOfRange(array, a1e + 1, a2e) : Arrays.copyOfRange(array, a1e + 1, a2e + 1);
        T subarray1 [] = Arrays.copyOfRange(array, a1s, a1e + 1);
        T subarray2 [] = Arrays.copyOfRange(array, a1e + 1 , a2e + 1);
        int i = 0, j = 0, k = a1s, l = a1e + a2e; //i, j, k are loop runner for the first second and merged array
        while(i < subarray1.length && j < subarray2.length){
            if( subarray1[i].compareTo(subarray2[j]) <= 0 ){//copy the lowest value between the two sub arrays in the lowest k index
                array[k++] = subarray1[i];
                i++;
            }
            else{
                array[k++] = subarray2[j];
                j++;
            }
        }
        //copying the remaining part of the arrays as one will always finish before the other one
        for(;i < subarray1.length ; i++){
            array[k] = subarray1[i];
            k++;//same as array[k++]
        }
        for(;j < subarray2.length ; j++){
            array[k] = subarray2[j];
            k++;
        }
    }
    //this mergeSort function sort the element of the array between as and ae index 0 and array.length to sort the whole array
    //by recursively calling itself on the half of the given array and sort the first half and then the second half and merge them
    static <T extends Comparable<T>> void mergeSort(T array [], int asi, int aei){
        int ami;
        if(asi < aei){
            ami = ((asi + aei)/2) ; //the array's middle index
            mergeSort(array, asi, ami);
            mergeSort(array, ami + 1, aei);
            merge(array, asi, ami, aei);
        }
    }
    //display array content
    static <T> void display(T array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}