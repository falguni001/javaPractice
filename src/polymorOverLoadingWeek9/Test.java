package polymorOverLoadingWeek9;

public class Test {
    // compile time polymorphism
    //static(method overloading
    //same class ,same name method ,differnt argument ,compile time
// with  differnt number of argument
    //void  show method do not have any argument
    // void show (int ) has one argument
    void show(){
        System.out.println("void 1 method ");
    }
    void show (int a){
        System.out.println("void show output is 10");
    }

    public static void main(String[] args) {
        Test t =new Test();
        t.show();
        t.show(10);
    }
}
