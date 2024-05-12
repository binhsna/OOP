package th2;

public class TH2Run {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        car.setEngine(new Engine("BMW", 100, false));
        car.setSeatbelt(new SeatBelt("VN", 2000, false));

        //car.run();
        car.getSeatbelt().setStatus(true);
        car.starting();
        car.run();
        car.stop();
        car.leave();
    }
}