package module02JavaAdvance.day13.demo02Stream;

import java.util.stream.Stream;

public class Demo06StreamLimit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("10", "12", "18");
        stream.limit(2).forEach(num-> System.out.println(num));
    }
}
