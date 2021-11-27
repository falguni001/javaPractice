package week9HomeworkInheritance;

public class AnimalInheritance {
    void bark (){
        System.out.println("Animal is barking");
    }
    static class Dog extends AnimalInheritance {
        void eat(){
            System.out.println("dog is eating ");
        }

        public static void main(String[] args) {
            Dog d =new Dog();
            d.bark();
             d.eat();
        }
    }

}
