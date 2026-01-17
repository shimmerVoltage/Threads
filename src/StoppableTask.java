class StoppableTask implements Runnable {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        int counter = 0;
        while (running) {
            counter++;
            System.out.println("Working... iteration: " + counter);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Thread stopped. Total iterations: " + counter);
    }
}
