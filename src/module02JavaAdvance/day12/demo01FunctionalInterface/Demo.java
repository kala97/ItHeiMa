package module02JavaAdvance.day12.demo01FunctionalInterface;

public class Demo {
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());

        show(() -> System.out.println("使用匿名内部类重写接口中的抽象方法"));
    }
}
