package polymorOverLoadingWeek9;

public class Test1 {
    //sequence of argument
    void show (int a,String b){
        System.out.println(25  + " falguni");
    }
    void show (String b, int a){
        System.out.println("dhiyana " + 19);

    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.show(25,"falguni");
        test1.show("dhiyana ",19);
    }

}


