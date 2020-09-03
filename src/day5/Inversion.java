package day5;
//Algorithm : get the number of inversion in an Array running time O(n^2)
//Let A[1..n] be an array of n distinct numbers. If i < j and A[i] > A[j], then the
//pair .i; j / is called an inversion of A.
public class Inversion {
    public static void main(String args[]){
        Integer array [] = {2, 3, 8, 6, 1};
        Integer array2 [] = {8, 6, 3, 2, 1};
        getInversion(array);
        System.out.println("");
        getInversion(array2);
    }
    public static <T extends Comparable <T>> void getInversion(T[] array){
        int x = 0; //number of inversions
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i].compareTo(array[j]) > 0)
                    System.out.println("Inversion number "+ ++x + " with: " + array[i] + " and " + array[j]);
            }
        }
    }
}
