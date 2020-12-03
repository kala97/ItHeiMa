package module02JavaAdvance.day13.demo02Stream;

import java.util.stream.Stream;

public class Demo04SteamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("10", "12", "18");
        Stream<String> stream1 = Stream.of("10", "12", "18");
        stream.map(Integer::parseInt).forEach(System.out::println);
        long count = stream1.count();
        System.out.println(count);
    }
}
