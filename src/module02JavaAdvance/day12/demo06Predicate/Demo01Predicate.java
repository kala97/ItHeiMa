package module02JavaAdvance.day12.demo06Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(checkString(s, t -> t.length() > 5));
    }
}
