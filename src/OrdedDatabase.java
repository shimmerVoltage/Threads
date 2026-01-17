import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class OrdedDatabase {
    private final List<String> orders = new ArrayList<>();
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    public void addOrder(String order) {
        rwLock.writeLock().lock();
        try {
            orders.add(order);
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public List<String> getOrders() {
        rwLock.readLock().lock();
        try {
            return new ArrayList<>(orders);
        } finally {
            rwLock.readLock().unlock();
        }
    }
}
