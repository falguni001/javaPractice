package week9HomeworkInheritance;

public class A {
    // multilevel inheritance
    void Triangle (){
        System.out.println("Triaanle has three side ");

    }
    static  class B  extends A {
        void Reactangle(){
            System.out.println(" Rectangle has four side ");

        }
        static class C extends B {
            void Square(){
                System.out.println("Square has four side ");

            }
            public static void main(String[] args) {

                        C obj3 =new C();
                System.out.println("class a");
                        obj3.Triangle();
                System.out.println("class b");
                        obj3.Reactangle();
                System.out.println("class c");
                        obj3.Square();
            }
                }
            }
        }

