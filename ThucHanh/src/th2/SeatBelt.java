package th2;

public class SeatBelt {
    private String brand; // Thương hiệu
    private float length; // Độ dài
    private boolean status; // Trạng thái dây an toàn

    public SeatBelt() {
    }

    public SeatBelt(String brand, float length, boolean status) {
        this.brand = brand;
        this.length = length;
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
