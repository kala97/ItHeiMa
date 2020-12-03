package module02JavaAdvance.day13.demo02Stream;

import java.util.stream.Stream;

public class Demo08StremConcat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("10", "12", "18");
        Stream<String> stream1 = Stream.of("102", "122", "182");
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(num-> System.out.println(num));
    }
}
