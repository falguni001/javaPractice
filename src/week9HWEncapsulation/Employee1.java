package week9HWEncapsulation;

public class Employee1 {
    private int emp_id;

    public Employee1(String  name , int  emp_id) {
    }

    public Employee1() {

    }

    public void setEmp_id(int emp_id)
    {

        this.emp_id = emp_id;
    }
    public int getEmp_id(){
        return emp_id;
    }
    static class company {
        public static void main(String[] args) {
            Employee1 e = new Employee1();
            e.setEmp_id(102);
            System.out.println(e.getEmp_id());
        }
    }
}
