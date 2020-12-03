package module02JavaAdvance.day12.demo06Predicate;

import java.util.function.Predicate;

public class Demo04PredicateNegate {
    public static boolean predicatenegate(String s, Predicate<String> pre){
        return pre.negate().negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(predicatenegate(s, (str) -> {
            return str.length() > 5;
        }));
    }
}
