package week10TryCatchHW;

public class TryCatchCatchFinally {
    public static void main(String[] args) {
        try {
            // once it exception  occur than after the exception line will not print like line 10  to 12
            // it will goes in catch block and than finally block
            // in the two  catch block you have  write Exception and Arethmetic Exeception  (parent child relation)
            int a =100;
            int b=0;
            int c= a/b;
            System.out.println(c);
            String  s = "abc ";
            System.out.println("abc");

        }catch (ArithmeticException e){
            System.out.println(e);

        }catch (Exception e1){
            System.out.println(e1);

        }finally {
            System.out.println("you are in finally block ");

        }
    }
}
