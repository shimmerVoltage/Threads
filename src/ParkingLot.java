import java.util.concurrent.Semaphore;

public class ParkingLot {
    private final Semaphore spots;

    public ParkingLot(int places) {
        this.spots = new Semaphore(places);
    }

    public void parkCar(String car) throws InterruptedException {
        spots.acquire();
        try {
            System.out.println(car + "parked");
            Thread.sleep(1000);
        } finally {
            spots.release();
            System.out.println(car + "go away");
        }
    }

}
