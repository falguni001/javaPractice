package week9Constructor;

public class Emp1 {

        String name;
        int emp_id;

        Emp1(String name, int emp_id) {
            this.name = name;
            this.emp_id = emp_id;
        }


        public static void main(String[] args) {
            Emp1 emp1 = new Emp1("falguni", 201);
            Emp1 emp2 = new Emp1("Amisha", 202);

            System.out.println("Emp1 :  " + emp1.name + "  " + emp1.emp_id);
            System.out.println("Emp2 :  " + emp2.name + "  " + emp2.emp_id);
        }
}
