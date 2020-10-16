package module02JavaAdvance.day07.Demo02Lambda;

import module02JavaAdvance.day07.Demo01ThreadPool.RunnableImp;

public class Demo02Runable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();
    }
}
