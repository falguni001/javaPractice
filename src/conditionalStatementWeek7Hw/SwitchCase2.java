package conditionalStatementWeek7Hw;

public class SwitchCase2 {
    public static void monthSelection(String  monthName) {
        switch (monthName) {
            case "January":
                System.out.println("Month Number 1  ");
                break;
            case "February " :
                System.out.println("Month Number 2  ");
                break;
            case "March":
                System.out.println("Month Number 3 ");
                break;
            case "April":
                System.out.println("Month Number 4");
                break;
            case "May":
                System.out.println("Month Number 5");
                break;
            case "June":
                System.out.println("Month Number 6   ");
                break;
            case "July":
                System.out.println("Month Number 7  ");
                break;
            case "August ":
                System.out.println("Month Number 8  ");
                break;
            case "September ":
                System.out.println("Month Number 9  ");
                break;
            case "October":
                System.out.println("Month Number 10  ");
                break;
            case "November ":
                System.out.println("Month Number 11 ");
                break;
            case "December ":
                System.out.println(" Month Number 12   ");
                break;
            default:
                System.out.println("Invalid Month");

        }
    }

    public static void main(String[] args) {
        monthSelection("March");
    }

}


