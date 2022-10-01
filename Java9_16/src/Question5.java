import java.util.Arrays;
import java.util.Optional;

public class Question5 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().filter(e->e>50).findFirst().ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("No value exists")
        );

        System.out.println(
                Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                        .filter(e->e>50).findFirst()
                        .or(()-> Optional.of(-1))
        );

        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().filter(e->e>50).findFirst()
                .orElseThrow();
    }
}
