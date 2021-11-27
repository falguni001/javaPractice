package week10LargestNumberHW;

public class SumOfArrays {
    public static void main(String[] args) {
        int  [] a= new int[] {10,4,5,6};
        int sum =0;
        for (int i=0;i<a.length; i++){
            sum= sum+a[i];

        }
        System.out.println(" sum of all element of  arrays " +sum);
    }
}
