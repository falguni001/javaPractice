package polymorOverLoadingWeek9;

public class Test2 {
    // changing number of argument
   static int add(int a, int b){
        return(a+b);
    }
    static double add(double a,double b, double c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        System.out.println(add(20,30));
        System.out.println(add(10.50,20.40,49.45));
    }
}
