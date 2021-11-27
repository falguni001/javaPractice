package week9Loops;

public class FibonacciSeries1 {
    static  int a =0, b =1,c=0;
    void printFib (int i){
        if (i>=1){
            c=a+b;
            a=b;
            b=c;

            System.out.println( "" + c);
            printFib(i-1);
        }
    }

    public static void main(String[] args) {
        FibonacciSeries1 f =new FibonacciSeries1();
        f.printFib(10);
    }
}
