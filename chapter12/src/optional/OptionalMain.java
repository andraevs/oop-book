package optional;

import java.util.List;
import java.util.Optional;

public class OptionalMain {

    public static Optional<Double> average(List<Integer> nums) {
        if (nums.isEmpty())
            return Optional.empty();
        else {
            double sum = 0;
            for (Integer i : nums) sum += i;
            return Optional.of(sum / nums.size());
        }
    }

    public static void main(String[] args) {
        System.out.println(average(List.of()));
        System.out.println(average(List.of(1, 2, 3)));
        Optional<Double> d1 = average(List.of());
        Optional<Double> d2 = average(List.of(1, 2, 3));
        d1.ifPresent(System.out::println);
        d2.ifPresent(System.out::println);
    }
}
