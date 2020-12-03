package module02JavaAdvance.day12.demo05Consumer;

import java.util.function.Consumer;

public class Demo01accept {
    public static void accept(String s, Consumer<String> con1){
        con1.accept(s);
    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        accept(s,(t)-> System.out.println(t));
    }
}
