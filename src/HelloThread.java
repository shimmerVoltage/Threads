/*public class HelloThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from thread" + getName());
    }
}*/
public class HelloThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from thread" + Thread.currentThread().getName());
    }
}