package module02JavaAdvance.day13.demo02Stream;

import java.util.stream.Stream;

public class Demo03StreamFilter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "张三丰", "周芷若");
        stream.filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));
    }
}
