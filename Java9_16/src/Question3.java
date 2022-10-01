import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(0,10).boxed().collect(Collectors.toList())
        );
    }
}
