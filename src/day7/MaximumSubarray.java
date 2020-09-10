package day7;

public class MaximumSubarray {
    public static void main (String args[]){

    }
    public int n3ms(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = array[i];
            if (sum < array[i]){
                sum = array[i];
            }
                    }
        return sum;
    }
}
