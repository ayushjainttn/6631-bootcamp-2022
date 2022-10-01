import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question6 {
    public static void main(String[] args) {
        Optional<Integer> ops = Optional.of(1);
        System.out.println(ops);
        Stream<Integer> stream = ops.stream();
        System.out.println(stream.collect(Collectors.toList()));

    }
}
