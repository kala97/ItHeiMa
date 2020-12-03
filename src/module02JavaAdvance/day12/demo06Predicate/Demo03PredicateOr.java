package module02JavaAdvance.day12.demo06Predicate;

import java.util.function.Predicate;

public class Demo03PredicateOr {
    public static boolean predicateor(String s, Predicate<String> pre1,Predicate<String> pre2){
       return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(predicateor(s, (str) -> {
            return str.length() > 6;
        }, (str) -> {
            return str.contains("t");
        }));
    }
}
