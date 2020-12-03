package module02JavaAdvance.day12.demo04Supplier;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> str){
        return str.get();
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(getString(()->s1+s2));
    }
}
