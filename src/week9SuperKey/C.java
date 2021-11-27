package week9SuperKey;

public class C {
// super key can invoke to parent class of method
    void Add(){
        System.out.println(" class c add method");
    }
    static class D extends C{
        void Add(){
            System.out.println(" class D add method ");
            super.Add();
        }

        public static void main(String[] args) {
            D d = new D();
            d.Add();

        }
    }
}
