package week9SuperKey;

public class A {
    //this. key refers to the child class intance veriable
    // super key refers to parents class superkey class veriable
    int a= 10;
}
class B extends A{
    int a =20;
    void show (int a ){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        B ob1 =new B();
        ob1.show(30);

    }
}

