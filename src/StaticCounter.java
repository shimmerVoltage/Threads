public class StaticCounter {
    private static  int count = 0;

    /*
    public static synchronized void increment(){
        count++;
    }*/

    public static int getCount(){
        return count;
    }

    public static  void increment(){
        synchronized (StaticCounter.class){
            count++;
        }
    }
}
