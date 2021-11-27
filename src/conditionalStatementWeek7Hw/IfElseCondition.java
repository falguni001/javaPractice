package conditionalStatementWeek7Hw;

public class IfElseCondition {
    // i have little problem but i can't find out( 20 to 50)
    public static void compare(int a, int b, int c, int d) {
        if (a < b && a < c) {
            System.out.println( ("0 to 18" + " is child"));
        }    if (b<a  && b >c ) {
            System.out.println(" 21 to 50" + "is healthy man ");
        } else  {
            System.out.println("51 to 75" + " is retired man ");
        }
    }

    public static void main(String[] args) {
        compare(18,20,30,40);
        compare(30,45,50,60);


    }
}

