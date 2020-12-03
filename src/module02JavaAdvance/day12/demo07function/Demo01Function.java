package module02JavaAdvance.day12.demo07function;

import java.util.function.Function;

public class Demo01Function {
    public static void change(String s, Function<String,Integer> fun){
        Integer integer = fun.apply(s);
        System.out.println(integer);
    }

    public static void main(String[] args) {
        String s = "1234567";
        change(s, str -> Integer.parseInt(str));
    }
}
