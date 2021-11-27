package homeworkWeek6;

public class VoidMethod {
    // we have to creat object
    void play (){
        System.out.println("my kids  love to play ");
    }
    void jump (){
        System.out.println("my kids love to jump");
    }

    public static void main(String[] args) {
        VoidMethod voidMethod = new VoidMethod();
        voidMethod.play();
        voidMethod.jump();
    }
}

