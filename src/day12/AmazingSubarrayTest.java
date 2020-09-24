package day12;

//https://www.interviewbit.com/problems/amazing-subarrays/

import java.util.ArrayList;

public class AmazingSubarrayTest {
    public static void main(String args[]){
        System.out.println(amazingSub("ABE"));

    }
    static int amazingSub(String S){
        int n = 0;
       if(S.length() >= 1 || S.length() < 1000000){
           String vowel [] = {"a", "e", "i", "o", "u"};
           for (int i = 0; i < S.length(); i++) {
               for (int j = 0; j < vowel.length; j++) {
                   if(String.valueOf(S.charAt(i)).compareTo(vowel[j]) == 0 || String.valueOf(S.charAt(i)).compareTo(vowel[j].toUpperCase())==0){
                       n += (S.substring(i, S.length()).length());
                   }
               }
           }
       }
        return n;
    }
    static int makeSub(String s){
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < s.length() - 1; i++) {
            array.add(s.substring(0, i + 1));
        }
        array.add(s);
        return array.size();
    }
//    static ArrayList <String> makeSub(String s){
//        ArrayList<String> array = new ArrayList<String>();
//        for (int i = 0; i < s.length(); i++) {
//            array.add(s.substring(0, i + 1));
//        }
//        array.add(s);
//        return array;
//    }
    public static void  display (ArrayList<String> intervals){
        for(int i = 0; i < intervals.size() - 1; i++){
            System.out.println(intervals.get(i));
        }
    }
}
