package day8;

import java.util.HashSet;

public class Duplicate {
    public static void main(String args []){
       int [] array = {3, 1, 4, 1, 4};
       System.out.println(findDuplicate(array));
    }
    public static int findDuplicate(int [] array){
        int value = -1; //initialise the duplicate value at false
        int i; //our iterator
        HashSet <Integer> hashSet = new HashSet<Integer>();
        for (i = 0; i < array.length - 1; i++) {
            if(!hashSet.add(array[i])) //return the first duplicate element
                return array[i];
        }
        //to save the space complexity if the last element can be entered, do not enter it as it's not the duplicate
        if(!hashSet.add(array[i]))
            return array[i];
        return value;
    }
}
