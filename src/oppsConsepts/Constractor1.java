package oppsConsepts;

import week9HomeworkInheritance.Constractor;

public class Constractor1 {
    String name ;
    int emp;
    Constractor1( String name,  int emp){
        this.name =name ;
        this.emp= emp;

    }

    public static void main(String[] args) {

        Constractor1 constractor1 = new Constractor1( "megha",209);
        System.out.println(constractor1.name + "  " + constractor1.emp );
    }
}
