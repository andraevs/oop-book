package streams;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        Stream<Integer> ints = Stream.of(1, 2, 3);
        Predicate<Integer> odd = x -> x % 2 == 1;
        System.out.println(ints.allMatch(odd));
        ints = Stream.of(1, 2, 3);
        System.out.println(ints.anyMatch(odd));
        Stream.of(1, 2, 3).forEach(System.out::println);
        Integer res = Stream.of(1, 2, 3).reduce(0, (x, y) -> x + y);
        System.out.println(res);
        String con = Stream.of("hello", " ", "world").reduce("", String::concat);
        System.out.println(con);
        Stream<Integer> empty = Stream.empty();
        System.out.println(empty.reduce((x, y) -> x + y));
        System.out.println(Stream.of(1).reduce((x, y) -> x + y));
        System.out.println(Stream.of(1, 2, 3).reduce((x, y) -> x + y));
        Stream<Integer> stream = Stream.of(3, 1, 4, 6, 2, 7, 5);
        TreeSet<Integer> set1 = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set1);
        TreeSet<Integer> set2 = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2);
        Set<Integer> set3 = stream.collect(Collectors.toSet());
        System.out.println(set3);
        List<String> emptyList = List.of();
        List<String> listOne = List.of("one", "two");
        List<String> listTwo = List.of("three", "four");
        Stream<List<String>> streamOfLists = Stream.of(emptyList, listOne, listTwo);
        streamOfLists.flatMap(l -> l.stream())
                .forEach(System.out::println);
        Stream.of("mary","john","andrew","jane")
                .sorted().forEach(System.out::println);
        int count=Stream.of("mary","john","andrew","jane")
                .peek(System.out::println).collect(Collectors.toList()).size();
        System.out.println(count);

    }
}
