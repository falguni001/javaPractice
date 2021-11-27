package week9HomeworkInheritance;

public class Constractor {
    // constractor  use for intializes an object
    //save the line

    String name;
    int emp_id ;
    Constractor(String name ,int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }

    public static void main(String[] args) {
        Constractor c1 = new Constractor("falguni",201);
        Constractor c2= new Constractor("amish",202);
        System.out.println("Employee 1:  "+c1.name+" " +c1.emp_id);
        System.out.println("Employee 2:    " +c2.name+ " " +c2.emp_id);

    }


}
