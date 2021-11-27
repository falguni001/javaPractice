package Acm1;

public class MyPublic {
    public void sleep() {
        System.out.println("my phone is on sleep mode ");
    }

    public void run() {
        System.out.println("my program is running ");
    }

    public static void main(String[] args) {
        MyPublic myPublic = new MyPublic();
        myPublic.run();
        myPublic.sleep();
        MyDefault myDefault = new MyDefault();
        myDefault.sub(20,12);



    }
}


