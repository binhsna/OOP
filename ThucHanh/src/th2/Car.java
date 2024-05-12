package th2;

public class Car {
    private String title;
    private String brand;       // Thương hiệu
    private boolean status;     // Trạng thái bật tắt
    private Engine engine;      // Động cơ
    private SeatBelt seatbelt;  // Dây an toàn

    public Car() {
        seatbelt = new SeatBelt();
        engine = new Engine();
    }

    public Car(String title, String brand, boolean status) {
        this();
        this.title = title;
        this.brand = brand;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SeatBelt getSeatbelt() {
        return seatbelt;
    }

    public void setSeatbelt(SeatBelt seatbelt) {
        this.seatbelt = seatbelt;
    }

    // Khởi động
    public void starting() {
        // Kiểm tra dây an toàn
        if (this.seatbelt.isStatus()) {
            this.status = true;
            this.engine.start();
        }
    }

    // Hàm chạy
    public void run() {
        if (this.engine.isStatus()) {
            System.out.println("Xe dang chay!");
        } else {
            System.out.println("Xe chua khoi dong!");
        }
    }

    // Hàm dừng
    public void stop() {
        this.engine.setStatus(false);
        this.status = false;
    }

    // Hàm rời khỏi xe
    public void leave() {
        if (this.engine.isStatus()) {
            System.out.println("Khong the roi khoi xe khi chua tat may!");
        } else {
            this.seatbelt.setStatus(false);
            System.out.println("Roi khoi xe thanh cong!");
        }
    }
}
