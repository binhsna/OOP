package Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", "150", "1.2", "Đỏ");
        v1.init();
        v1.display();
        v1 = new Car();
        v1.init();
        v1.display();

        Car car = new Car();
        car.init();
        car.start();
        car.run();
        car.sleep();
        car.stop();
        //Car a = (Car) new Vehicle();
        //Vehicle v = new Car();
    }
}

// Định nghĩa lớp Vehicle (Phương tiện giao thông)
class Vehicle {
    private String Brand; // Thương hiệu
    private String Speed; // Tốc độ
    private String Weight; // Trọng lượng
    private String Color;

    public Vehicle() {
    }

    public Vehicle(String Band, String Speed, String Weight, String Color) {
        this();
        this.Brand = Band;
        this.Speed = Speed;
        this.Weight = Weight;
        this.Color = Color;
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hãng xe: ");
        this.Brand = scanner.nextLine();
        System.out.print("Nhập tốc độ: ");
        this.Speed = scanner.nextLine();
        System.out.print("Nhập trọng lượng: ");
        this.Weight = scanner.nextLine();
        System.out.print("Nhập màu sắc: ");
        this.Color = scanner.nextLine();
    }

    public void display() {
        System.out.println("Thương hiệu: " + this.Brand
                + " | Tốc độ: " + this.Speed + " km/h"
                + " | Trọng lượng: " + this.Weight + " tấn"
                + " | Màu sắc: " + this.Color);
    }
}

interface Movement {
    void run();

    void sleep();

    void start();

    void stop();
}

class Car extends Vehicle implements Movement {

    private int SeatNum; // Số chỗ ngồi

    public Car() {
    }

    public Car(String Band, String Speed, String Weight,
               String Color, int SeatNum) {
        super(Band, Speed, Weight, Color);
        this.SeatNum = SeatNum;
    }

    @Override
    public void init() {
        super.init();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chỗ ngồi:");
        this.SeatNum = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Số chỗ ngồi: " + this.SeatNum);
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }
}
