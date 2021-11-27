package week9SuperKey;

public class Animal {
    Animal(){
        // super key use to invoke parent class constructor
        System.out.println("Animal is live  in the jungle " );
    }
    static class Dog extends Animal{
        Dog(){
            super();
            System.out.println("DOG is live in jungle and house ");
        }

        public static void main(String[] args) {
            Dog d= new Dog();

        }
    }
}
