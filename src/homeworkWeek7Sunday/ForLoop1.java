package homeworkWeek7Sunday;

public class ForLoop1 {
    public static void table (int tableno) {

        for(int i=1;  i<=10; i++ ){
            System.out.println(tableno+"*"+i+"="+tableno*i);
        }

    }

    public static void main(String[] args) {
        System.out.println("This is timetable of 10  ");
        table(10);
        System.out.println("this is table no 20");
        table(20);
    }
}
