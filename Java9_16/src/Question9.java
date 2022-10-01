import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question9 {
    public static void main(String[] args) {
        List ls = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.toUnmodifiableList());
        System.out.println(ls);
        ls.add(10); //will throw error
    }
}
