package week10TryCatchHW;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // risky code
            int a =100;
            int b= 0 ;

            int c = a/b ;
            System.out.println(c);
        }
        catch (Exception e){
            // handling code
            System.out.println(e);
        }
        System.out.println("hello");
        //  after exeption  code will continue to check it is not terminate
    }
}
