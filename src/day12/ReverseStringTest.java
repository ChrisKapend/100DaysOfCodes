package day12;

public class ReverseStringTest {
    public static void main (String args []){
        System.out.println("test".substring(0, 0));
    }

    static String reverseStr(String str){
        int length = str.split(" ").length;
        String rst = "";
        String [] A = new String[length];
        for (int i = 0; i < length; i++) {
            A[i] = str.split(" ")[i];
        }
        for (int i = 0; i < length; i++) {
            rst += A[length - 1 - i] + " ";
        }
        return rst;
    }
    static String reverseStr_(String str){
        str = str.trim();
        String rst = new String();
        for (int i = str.split(" ").length - 1; i > -1 ; i--) {
            rst += str.split(" ")[i]+" ";
        }
        return rst.trim();
    }
}
