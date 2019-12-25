package Functional;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a","a", "bk", "c", "fg");

        Function<String, String> function = (String s) -> {
            return s.toUpperCase();
        };

        Predicate<String> predicate = (String s) -> {
            return s.length() == 1;
        };

        List<String> collect = stringStream
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() == 1)
                .distinct()
                .limit(1)
                .collect(Collectors.toList());

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);

        integers.stream()
                .map(s -> s += 2)
                .filter(s -> s%2 == 0)
                .filter( s-> s%5 == 0)
                .forEach(System.out::println);

        Person p = null;
        Optional<Person> optionalPerson = Optional.ofNullable(p);

        System.out.println(optionalPerson.orElse(new Person()


        ));

    }
}
