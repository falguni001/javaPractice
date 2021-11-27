package week9HWEncapsulation;
// why do i have to make bank class as static? otherwise it was not going through
public class Account {
    private int accNo;
private String name ;


    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }
    public  void setName ( String name ){
        this.name =name;

    }
    public String getName(){
        return name ;

    }
    public static   class Bank {
        public static void main(String[] args) {
            Account account= new Account();
            account.setAccNo(120);
            account.setName("falguni");
            System.out.println("Account holder");
            System.out.println(account.getAccNo());
            System.out.println(account.getName());
        }
    }


    }


