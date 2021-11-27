package falguni;

public class VeriableTypes {
    int a =10;// intance veriable which need object to print (int a) value and add and sub
    int b =20;
    int c =15;
       public  void add (){
        int  mytotal = (a+b+c);
         System.out.println(mytotal);
     }
       public  void sub(){
         int mysub= (b-a);
        System.out.println(mysub);
     }

    public static void main(String[] args) {
           VeriableTypes vr = new VeriableTypes();
        System.out.println(vr.a);
        System.out.println(vr.b);
         vr.add();
         vr.sub();



    }
}
