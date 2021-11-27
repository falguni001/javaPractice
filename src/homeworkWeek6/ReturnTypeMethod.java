package homeworkWeek6;

public class ReturnTypeMethod {
    //public class return type method is not static it will need object
    public int add (){
        int a = 3;
        int b = 4;
        return a +b;
    }
    public static void main(String[] args) {
        ReturnTypeMethod returnTypeMethod = new ReturnTypeMethod();
        System.out.println(returnTypeMethod.add());

    }


}
