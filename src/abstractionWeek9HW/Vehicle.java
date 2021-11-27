package abstractionWeek9HW;

abstract class Vehical {
    abstract void run();
}
class Scooter extends Vehical {
    void run () {
        System.out.println(" scooter start with key");
    }


    public static void main(String args[]) {
        Scooter s = new Scooter();
        s.run();

            }
        }





