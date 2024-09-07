import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Class to make tests related to the functional interface Predicate
 */
public class FunctionalInterfacePredicate {
    /**
     * Main method to execute the tests invoking other methods
     *
     * @param args CLI args (ignored)
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FunctionalInterfacePredicate.forma1();
        System.out.println("------------------------");
        FunctionalInterfacePredicate.forma2();
        System.out.println("------------------------");
        FunctionalInterfacePredicate.forma3();
    }

    /**
     * Way 1 to use the functional interface Predicate
     */
    public static void forma1() {
        List<String> linguagensProgramacao = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        linguagensProgramacao.stream().filter(maisDeCincoLetras).forEach(System.out::println);
    }

    /**
     * Way 2 to use the functional interface Predicate
     */
    public static void forma2() {
        List<String> linguagensProgramacao = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        linguagensProgramacao
            .stream()
            .filter(new Predicate<String>() {
                @Override
                public boolean test(String palavra) {
                    return palavra.length() > 5;
                }
                
            })
            .forEach(System.out::println);
    }

    /**
     * Way 3 to use the functional interface Predicate
     */
    public static void forma3() {
        List<String> linguagensProgramacao = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        linguagensProgramacao
            .stream()
            .filter(palavra -> palavra.length() > 5)
            .forEach(System.out::println);
    }
}
