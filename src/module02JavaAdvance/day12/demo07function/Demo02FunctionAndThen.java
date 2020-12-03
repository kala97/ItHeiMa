package module02JavaAdvance.day12.demo07function;

import java.util.function.Function;

public class Demo02FunctionAndThen {
    public static void changeandthen(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }

    public static void main(String[] args) {
        String s = "12345";
        changeandthen(s,str->Integer.parseInt(str)+10,num->num.toString());
    }
}
