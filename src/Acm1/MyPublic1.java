package Acm1;

public class MyPublic1 {
    static int x = 20;
    static  int y =30;
    static  int z = x+y;

    public static void add(){
        System.out.println(z);
    }

    public static void main(String[] args) {
        add();
        MyPublic myPublic = new MyPublic();
        myPublic.run();
        myPublic.sleep();
        MyDefault myDefault = new MyDefault();
        myDefault.sub(20,12);



    }
}
