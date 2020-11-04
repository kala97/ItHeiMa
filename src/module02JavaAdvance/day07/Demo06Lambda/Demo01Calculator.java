package module02JavaAdvance.day07.Demo06Lambda;

public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(120,130,(int a,int b)->{
            return a+b;
        });
    }

    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
