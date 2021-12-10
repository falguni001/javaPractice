package oppsConsepts;

public class AA {
    void eat (){
        System.out.println("AA is eating ");

    }
    public static class BB extends AA{
        void bark(){
            System.out.println("BB is barking ");
        }
        public static class CC extends BB{
            void Sing (){
                System.out.println("CC is singing ");
            }
        }

        public static void main(String[] args) {
            BB b = new  BB();
            CC c = new  CC();
            c.bark();
            b.eat();

            
        }
    }
}
