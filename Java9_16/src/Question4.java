import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.iterate(0, i->i<10, i->i+2).boxed().collect(Collectors.toList())
        );
    }
}
