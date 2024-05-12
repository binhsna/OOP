package th1.accessory;

public class Lamp {
    private int height;
    private String type;
    private boolean status;

    public Lamp() {
    }

    public Lamp(int height, String type, boolean status) {
        this.height = height;
        this.type = type;
        this.status = status;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void switchLamp() {
        this.status = !this.status;
    }
}
