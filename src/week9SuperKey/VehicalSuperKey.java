package week9SuperKey;

public class VehicalSuperKey {
    String name1 = "Bmw";
}
class Car extends VehicalSuperKey{
    String name ="Audi";
    void name(){
        System.out.println(name );
        System.out.println( super.name1);
    }

    public static void main(String[] args) {
        Car c =new Car();
        c.name();

    }
}
