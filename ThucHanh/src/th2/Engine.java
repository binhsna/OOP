package th2;

public class Engine {
    private String manufacture; // Hãng sản xuất
    private float power; // Công suất
    private boolean status; // Trạng thái bật, tắt động cơ

    public Engine() {
    }

    public Engine(String manufacture, float power, boolean status) {
        this.manufacture = manufacture;
        this.power = power;
        this.status = status;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Phương thức khởi động
    public void start() {
        if (!this.status) {
            this.status = true;
        }
    }

    // Phương thức tắt máy
    public void stop() {
        if (this.status) {
            this.status = false;
        }
    }
}
