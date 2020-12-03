package module02JavaAdvance.day12.Demo03LambdaTest;

public class Demo01Runnable {
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了");
            }
        });

        startThread(() -> System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了"));
    }
}
