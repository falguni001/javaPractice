package week10LargestNumberHW;

import java.util.Arrays;

public class FindSmallestNumber {
    public static int getSmallest(int[] a ,int total){
        Arrays.sort(a);
        return a[0];

    }

    public static void main(String[] args) {
        int a [] ={22,10,12,14,35};
        System.out.println("smallest :" + getSmallest(a,5));
    }
}
