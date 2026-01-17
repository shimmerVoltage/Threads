void main() throws InterruptedException {
    /*Counter counter = new Counter();
    Runnable incrementTask = () -> {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    };

    Thread t1 = new Thread(incrementTask);
    Thread t2 = new Thread(incrementTask);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(counter.GetValue());

     */

    /*
    Worker w = new Worker();
    w.start();
    //
    w.shutdown();

     */

    /*
    Object lock = new Object();
    synchronized (lock){

    }

     */

    /*
    ParkingLot parkingLot = new ParkingLot(3);
    for (int i = 1; i <= 5; i++) {
        final String car = "Car" + i;
        new Thread(() -> {
            try {
                parkingLot.parkCar(car);
            } catch (InterruptedException e) {
                System.out.println(e);
                ;
            }
        });
    }

     */
    Printer printer = new Printer();

    Runnable task1 = () -> {
        printer.print("Thread 111111111111111111111111111111111111111111");
    };

    Runnable task2 = () -> {
        printer.print("Thread 222222222222222222222222222222222222222222");
    };

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);

    System.out.println("Starting threads");

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("Threads completed");

    System.out.println("----------------------------------------------------------");
    System.out.println("----------------------------------------------------------");
    System.out.println("----------------------------------------------------------");

    StoppableTask task = new StoppableTask();
    Thread workerThread = new Thread(task);

    System.out.println("Starting thread");
    workerThread.start();

    Thread.sleep(3000);

    System.out.println("Sending stop signal");
    task.stop();

    workerThread.join();
    System.out.println("Worker thread has stopped.");
}
