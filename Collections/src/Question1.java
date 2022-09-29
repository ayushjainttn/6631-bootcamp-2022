import java.util.*;

public class Question1 {
    public static void main(String [] args){
        List<Float> list = new ArrayList<>();

        list.add(4.5F);
        list.add(2.7F);
        list.add(6.9F);
        list.add(9.4F);
        list.add(7.6F);

        Iterator<Float> it = list.iterator();
        float sumOfListElements = 0;
        while(it.hasNext()){
            sumOfListElements += it.next();
        }

        System.out.println("Sum of List Elements : "+sumOfListElements);
    }
}
