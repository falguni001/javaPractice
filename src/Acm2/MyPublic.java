package Acm2;

import Acm1.MyDefault;

public class MyPublic {
    public static void jump (){
        System.out.println("kids loves jumping ");

    }
    public  static void eat(){
        System.out.println("kids do not like to eat ");
    }

    public static void main(String[] args) {
        jump();
        eat();
        Acm1.MyDefault myDefault = new MyDefault();
        myDefault.sub(20,12);

    }

}
