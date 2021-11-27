package conditionalStatementWeek7Hw;

public class SwitchCase1 {
    public static void monthSelection(int  monthName) {
        switch (monthName) {
            case 1:
                System.out.println("Month Number 1  January");
                break;
            case 2:
                System.out.println("Month Number 2 february ");
                break;
            case 3:
                System.out.println("Month Number 3 March");
                break;
            case 4:
                System.out.println("Month Number 4 April");
                break;
            case 5:
                System.out.println("Month Number 5 May");
                break;
                case 6:
                System.out.println("Month Number 6  June ");
                break;
            case 7:
                System.out.println("Month Number 7  July");
                break;
            case 8:
                System.out.println("Month Number 8  August");
                break;
            case 9:
                System.out.println("Month Number 9 September ");
                break;
            case 10:
                System.out.println("Month Number 10 October ");
                break;
            case 11:
                System.out.println("Month Number 11 November ");
                break;
            case 12:
                System.out.println(" Month Number 12 December  ");
                break;
            default:
                System.out.println("Invalid Month");

        }
    }

    public static void main(String[] args) {
        monthSelection(7);
    }

    }

