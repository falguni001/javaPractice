package week10LargestNumberHW;

import java.util.Arrays;

public class FindLargestNumber {

    public static int getLargest(int[] a, int total) {
        Arrays.sort(a);
        return a[total - 1];
    }

    public static void main(String args[]) {
        int a[] = {8, 2, 25, 6, 3, 2};

        System.out.println("Largest: " + getLargest(a, 6));


    }
}
