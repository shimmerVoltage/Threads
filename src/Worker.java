public class Worker extends Thread{
    private volatile boolean running = true;

    public void run(){
        while (running){

        }
        System.out.println("Thread is complete");
    }

    public void shutdown(){
        running = false;
    }
}
