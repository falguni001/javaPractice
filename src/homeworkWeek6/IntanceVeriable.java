package homeworkWeek6;

public class IntanceVeriable {
    //intance veriable which need object to print (int a,b,c ) value and add and sub
    int a =10;
    int b = 20;
    int c = 30;
    public void add(){
        int d = (a+b+c);
        System.out.println(d);
    }
    public void sub (){
        int e = (c-a);
        System.out.println(e);
    }
    public static void main(String[] args) {
        IntanceVeriable iv = new IntanceVeriable();
        System.out.println(iv.a);
        System.out.println(iv.b);
        System.out.println(iv.c);
        iv.add();
        iv.sub();
    }
}
