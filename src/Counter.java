import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int value = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try{
            value++;
        }
        finally {
        lock.unlock();
        }
    }

    /*
    public synchronized void increment() {
            value++;
    }

     */

    /*
    public void increment() {
        value++;
    }*/

    /*public void increment() {
        synchronized (this) {
            value++;
        }
    }

     */


    /*
    public int GetValue() {
        return value;
    }

     */

    public int GetValue() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }

}

