package module02JavaAdvance.day12.demo07function;

import java.util.function.Function;

public class Demo03Test {
    public static void test(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        int age = fun1.andThen(fun2.andThen(fun3)).apply(s);
        System.out.println(age);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        test(str,age->age.split(",")[1],age->Integer.parseInt(age),age->age+100);
    }
}
