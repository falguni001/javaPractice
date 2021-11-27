package polymorOverridingWeek9;

 class Supermarket {
     // overriding method is run time polymorphisam
     // we have to creat object for parent class and child class to invoke method
     // same name method ,differnt class,same argument ,runtime,inheritance
    void  checkThePrice () {
        System.out.println("supermarket price is  low ");
    }
    static   class Abc extends Supermarket{
        @Override
        void checkThePrice() {
            System.out.println("tesco price is higher than supermarket cotsco");
        }
        static class Xyz extends Supermarket{
            void checkThePrice(){
                System.out.println("Asda price is lower than tesco ");
            }

            public static void main(String[] args) {
                Supermarket s =new Supermarket();
                s.checkThePrice();
                Abc a = new Abc();
                a.checkThePrice();
                Xyz x =new Xyz();
                x.checkThePrice();
            }
        }
    }
}
