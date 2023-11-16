package streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
//
//        Stream<Integer> ints = Stream.of(1, 2, 3);
//        Predicate<Integer> odd = x -> x % 2 == 1;
//        System.out.println(ints.allMatch(odd));
//        ints = Stream.of(1, 2, 3);
//        System.out.println(ints.anyMatch(odd));
//        Stream.of(1, 2, 3).forEach(System.out::println);
//        Integer res = Stream.of(1, 2, 3).reduce(0, (x, y) -> x + y);
//        System.out.println(res);
//        String con = Stream.of("hello", " ", "world").reduce("", String::concat);
//        System.out.println(con);
//        Stream<Integer> empty = Stream.empty();
//        System.out.println(empty.reduce((x, y) -> x + y));
//        System.out.println(Stream.of(1).reduce((x, y) -> x + y));
//        System.out.println(Stream.of(1, 2, 3).reduce((x, y) -> x + y));
//        Stream<Integer> stream = Stream.of(3, 1, 4, 6, 2, 7, 5);
//        TreeSet<Integer> set1 = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
//        System.out.println(set1);
//        TreeSet<Integer> set2 = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set2);
//        Set<Integer> set3 = stream.collect(Collectors.toSet());
//        System.out.println(set3);
//        List<String> emptyList = List.of();
//        List<String> listOne = List.of("one", "two");
//        List<String> listTwo = List.of("three", "four");
//        Stream<List<String>> streamOfLists = Stream.of(emptyList, listOne, listTwo);
//        streamOfLists.flatMap(l -> l.stream())
//                .forEach(System.out::println);
//        Stream.of("mary","john","andrew","jane")
//                .sorted().forEach(System.out::println);
//        int count=Stream.of("mary","john","andrew","jane")
//                .peek(System.out::println).collect(Collectors.toList()).size();
//        System.out.println(count);
//        Stream<String> basicCol1=Stream.of("hello","beautiful","world");
//        String joinResult = basicCol1.collect(Collectors.joining(", "));
//        System.out.println(joinResult);
//        Stream<String> basicCol2=Stream.of("hello","beautiful","world");
//        Double avgres = basicCol2.collect(Collectors.averagingInt(x->x.length()));
//        System.out.println(avgres);
//        Stream<String> basicCol3= Stream.of("hello","be","world","be");
//        Map<String,Integer> colmap1 = basicCol3.collect(Collectors.toMap(s->s,s->s.length()));
//        Map<String,Integer> colmap2 = basicCol3.collect(Collectors.toMap(Function.identity(), String::length));
//        System.out.println(colmap1);

//        Stream<String> basicCol4= Stream.of("hello","be","world","be");
//        Map<Integer,String> colmap3 = basicCol4.collect(Collectors.toMap(
//                String::length, k->k,(s1,s2) -> s1+","+s2,TreeMap::new));
//        System.out.println(colmap3);
//        Stream<String> basicCol5= Stream.of("hello","be","world","be");
//        Map<Integer, List<String>> groupcol1 = basicCol5.collect(Collectors.groupingBy(String::length));
//        System.out.println(groupcol1);
//        Stream<String> basicCol6= Stream.of("hello","be","world","be");
//        TreeMap<Integer, Set<String>> groupcol2 = basicCol6.collect(Collectors
//                .groupingBy(String::length,TreeMap::new,Collectors.toSet()));
//        System.out.println(groupcol2);
//        Stream<String> basicCol7= Stream.of("hello","be","world","bee");
//        Map<Boolean, List<String>> partcol1 = basicCol7.collect(Collectors.partitioningBy(s->s.length()<=2));
//        System.out.println(partcol1);
        Stream<String> basicCol8= Stream.of("hello","be","world","bee");
        Map<Boolean, Long> partcol2 = basicCol8.collect(Collectors.partitioningBy(s->s.length()<=2,Collectors.counting()));
        System.out.println(partcol2);
        Stream<Employee> employeeStream = Stream.of(
                new Employee("John",Seniority.JUNIOR,12.5),
                new Employee("Mary",Seniority.JUNIOR,18.5),
                new Employee("Tom",Seniority.SENIOR,30),
                new Employee("Harry",Seniority.SENIOR,35),
                new Employee("Jee",Seniority.MASTER,100)
        );
        Map<Seniority,Double> avgSalaryPerSeniority = employeeStream.collect(Collectors
                .groupingBy(s->s.seniority,Collectors.mapping(s->s.salary,Collectors.averagingDouble(s->s))));
        System.out.println(avgSalaryPerSeniority);


    }
}
