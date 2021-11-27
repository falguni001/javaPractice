package homeworkWeek6;

public class ParameterizedCalculator {
    public static void myadd(int a ,int b){
        int c= (a+b);
        System.out.println("This is myadd total "  +  c);
    }
    public static void mysub(int d,int e){
        int j =(d-e);
        System.out.println("This is mysub answer"  +   j);
    }
    public static void mymulti(int f,int h){
        int i= (f*h);
        System.out.println("This is mymulti answer "  +  i);
    }
    public static void mydiv(int j,int k){
        int l= (j/k);
        System.out.println("This is myDiv answer"   +   l);
    }

    public static void main(String[] args) {
        myadd(20,30);
        mysub(50,25);
        mymulti(20,10);
        mydiv(100,10);

    }
}
