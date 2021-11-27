package interfaceWeek9HW;

interface  I1 {
    // we  have use implement key
    // we can achive multiple inheritance
    //
     void show();

    interface I2 {
        void display();

    }

    class t1 implements I1, I2 {

        @Override
        public void show() {
            System.out.println("1");

        }

        public void display() {
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        t1 t1 = new t1();
        t1.show();
        t1.display();
    }

}
