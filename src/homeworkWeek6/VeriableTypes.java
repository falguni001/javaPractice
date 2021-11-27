package homeworkWeek6;

public class VeriableTypes {
    // static does not need object to print value you can simply call by method
    static int a=10;
    static int b=20;
    static int c = 30;
    public static void add(){
        int total =(a+b+c);
        System.out.println( total);
    }

    public static void main(String[] args) {
        int d = (a+b);
        System.out.println(d);
        add();
    }

}
