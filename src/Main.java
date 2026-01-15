import org.w3c.dom.css.Counter;

void main() {
    /*Thread num = new Thread(() -> {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    });

    Thread letters = new Thread(() -> {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    });

    num.start();
    letters.start();

    HelloThread thread = new HelloThread();
    thread.start();
    System.out.println("Main thread closed");

     */

    /*Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println();
        }
    });
    thread.start();

     */

    /*
    Thread thread = new Thread(() -> {
        System.out.println(Thread.currentThread());
    });
    thread.run();
    thread.start();

     */

    /*
    Thread thread = new Thread(() -> {
        System.out.println(Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println("Done");
    });
    thread.start();
    thread.join();

     */

    Counter counter = new Counter();
    Thread t1 = new Thread(()->{
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    });
    Thread t2 = new Thread(()->{
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(counter.count);
}
