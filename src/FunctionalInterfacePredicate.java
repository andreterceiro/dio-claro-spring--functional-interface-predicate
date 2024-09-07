import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacePredicate {
    public static void main(String[] args) throws Exception {
        FunctionalInterfacePredicate.forma1();
    }

    public static void forma1() {
        List<String> linguagensProgramacao = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        linguagensProgramacao.stream().filter(maisDeCincoLetras).forEach(System.out::println);

    }
}
