package week9HomeworkInheritance;
import  java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        int l ,b, area;

        System.out.println("Enter value for both side " );
        Scanner  r = new Scanner(System.in);
        l=r.nextInt();
        b=r.nextInt();
         area = l * b;
        System.out.println( "Area of  rectaangle "+area);


    }
}
