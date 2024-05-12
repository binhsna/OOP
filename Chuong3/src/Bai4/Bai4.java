package Bai4;

public class Bai4 {
    public static void main(String[] args) {
        Beverage drink1 = new Wine("Whisky", "50 độ");
        //drink1.display();
        Bottle b1 = new Bottle(drink1, 5);
        b1.show();

        Beverage drink2 = new SoftDrink("Pepsi", "15%");
        //drink2.display();
        Bottle b2 = new Bottle(drink2, 0.2f);
        b2.show();
    }
}

// Đồ uống
abstract class Beverage {

    String brand; // Thương hiệu

    public Beverage() {
    }

    public Beverage(String brand) {
        this.brand = brand;
    }

    abstract public void display();
}

class Wine extends Beverage {

    String ABV; // Nồng độ cồn trong rượu

    public Wine() {
    }

    public Wine(String brand, String ABV) {
        super(brand);
        this.ABV = ABV;
    }

    @Override
    public void display() {
        System.out.println("Rượu: " + this.brand + " | Nồng độ cồn: " + this.ABV);
    }
}

// Class đồ uống có gas
class SoftDrink extends Beverage {
    String suger;

    public SoftDrink() {
    }

    public SoftDrink(String brand, String suger) {
        super(brand);
        this.suger = suger;
    }

    @Override
    public void display() {
        System.out.println("Nước ngọt có ga: " + this.brand
                + " | Lượng đường: " + this.suger);
    }
}

// Class chai, lọ
class Bottle {
    Beverage beverage;
    float volume; // Dung tích, thể tích

    public Bottle() {
    }

    public Bottle(Beverage beverage, float volume) {
        this.beverage = beverage;
        this.volume = volume;
    }

    public void show() {
        this.beverage.display();
        System.out.println("Dung tích: " + this.volume + " Lít");
    }
}
