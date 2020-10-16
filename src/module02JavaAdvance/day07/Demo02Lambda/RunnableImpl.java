package module02JavaAdvance.day07.Demo02Lambda;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新的线程创建了");
    }
}
