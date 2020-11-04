package module02JavaAdvance.day07.Demo04Lambda;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("eat");
            }
        });

        invokeCook(()->{
            System.out.println("eat");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
