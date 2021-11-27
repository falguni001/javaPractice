package week10ArraylistHW;
import java.util.ArrayList;
public class ArrayList1<S> {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(134);
        list1.add(150);
        list.addAll(0,list1);



        list.add(22);
        list.add(11);
        list.add(23);
        list.add(23);
        list.add(15);
        for (int i =0;i< list.size();i++)
            System.out.println(list.get(i));
        System.out.println(list.get(2));
        System.out.println(list.size());
       System.out.println(list.contains(3));





    }
}
