package oppsConsepts;

public class ObjectByReference {
    String name = "black";
    int age = 20;


    public static void main(String[] args) {
        ObjectByReference o = new ObjectByReference();
        System.out.println(o.name);
        System.out.println(o.age);

    }
}
