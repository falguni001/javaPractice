package Acm2;

import Acm1.MyPublic;

public class MyDefault {
    public void add(int a , int b ){
        int c =a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        MyDefault myDefault =new MyDefault();
        myDefault.add(20,34);
        Acm1.MyPublic myPublic = new MyPublic();
        myPublic.run();
        myPublic.sleep();
    }
}
