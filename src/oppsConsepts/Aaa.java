package oppsConsepts;
// single level inheritance
 class Aaa {
    void eat (){
        System.out.println(" Aaa is eating ");
    }
     static class Bbb extends Aaa{
        void run(){
            System.out.println("Bbb is running ");

        }

         public static void main(String[] args) {
             Bbb b = new Bbb();
             b.eat();
             b.run();

         }

    }
}
