import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProductCatalog {
    private final Map<String, String> products = new HashMap<>();
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    public void addProduct(String id, String name) {
        rwLock.writeLock().lock();
        try{
            products.put(id,name);
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public String getProduct(String id){
        rwLock.readLock().lock();
        try{
            return  products.get(id);
        }finally {
            rwLock.readLock().unlock();
        }
    }
}
