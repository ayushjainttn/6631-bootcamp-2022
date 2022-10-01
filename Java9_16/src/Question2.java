import java.util.Arrays;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                        .stream()
                        .takeWhile(integer -> integer<=5)
                        .collect(Collectors.toList())
        );
        System.out.println(
                Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                        .stream()
                        .dropWhile(integer -> integer<=5)
                        .collect(Collectors.toList())
        );
    }
}
