package module02JavaAdvance.day12.demo06Predicate;

import java.util.function.Predicate;

public class Demo02PredicateAnd {
    public static boolean predicateand(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
//        return pre1.test(s) && pre2.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(predicateand(s,
        (str) -> {
            return str.length()>5;
        },
        (str) -> {
            return str.contains("a");
        }));
    }
}
