package module02JavaAdvance.day07.Demo01ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());
    }
}
