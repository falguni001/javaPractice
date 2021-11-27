package week10TryCatchHW;

public class TryCatchFinally {
    public static void main(String[] args) {
        // finally will execute without any exception occur
        // finally will execute even after exception
      try {
        int a = 100 ;
        int b = 0;
        int c = a/b;

    }catch (Exception e){
          System.out.println(e);
      }
      finally {
          System.out.println("you are in finally code ");
      }
      }
}
