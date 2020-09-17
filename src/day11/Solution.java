package day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
// exercise https://www.interviewbit.com/problems/merge-overlapping-intervals/

public class Solution {

    public static void main(String args []){
        ArrayList<Interval> intervs = new ArrayList<Interval>();
        intervs.add(new Interval(33, 300));
        intervs.add(new Interval(1,3));
        intervs.add(new Interval(5, 6));
        intervs.add(new Interval (9, 20));
        intervs.add(new Interval(19, 34));
        intervs.add(new Interval (8,10));

        display(intervs);
        System.out.println("\n Merging");
        merge(intervs);
        display(intervs);
    }
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals);
        ArrayList<Interval> r = new ArrayList<Interval>();
        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i).end > intervals.get(i + 1).start) {
                Interval temp = new Interval(intervals.get(i).start, intervals.get(i + 1).end);
                r.add(temp);
                //intervals.remove(i + 1);
                i++;
            }
            else{
                r.add(intervals.get(i));
            }
        }
        intervals.clear();
        intervals.addAll(r);
        return intervals;
    }
    public static void  display (ArrayList<Interval> intervals){
        int i;
        for(i = 0; i < intervals.size() - 1; i++){
            System.out.print("[" + intervals.get(i).start+","+intervals.get(i).end+ "], ");
        }
        System.out.print("[" + intervals.get(i).start+","+intervals.get(i).end+ "]");
        System.out.println("");
    }
}
class Interval implements Comparable <Interval>{
    int start;
    int end;
    public Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
    @Override
    public int compareTo(Interval interval){
        if(this.start > interval.start)
            return 1;
        else if (this.start < interval.start)
            return -1;
        else{
            if(this.end > interval.end){
                return 1;
            }
            else if(this.end < interval.end){
                return -1;
            }
            else
                return 0;
        }
    }
}