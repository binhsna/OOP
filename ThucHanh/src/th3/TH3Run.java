package th3;

import java.util.Scanner;

public class TH3Run {
    public static void main(String[] args) {
        Animal a1 = new Dog("Phu Quoc", "black", "kid", 70, 120);
        a1.display();
        Dog d1 = new Dog();
        d1.init();
        d1.display();
    }
}

class Animal {

    String name;
    float weight;
    float height;

    public Animal() {
    }

    public Animal(String name, float weight, float height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    // Nhập dữ liệu từ bàn phím
    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Animal name: ");
        this.name = sc.nextLine();
        System.out.print("Animal weight: ");
        this.weight = sc.nextFloat();
        System.out.print("Animal height: ");
        this.height = sc.nextFloat();
    }

    // Hiển thị dữ liệu
    public void display() {
        System.out.println("Animal name: " + this.name
                + " | weight: " + this.weight + " | height: " + this.height);
    }
}


class Dog extends Animal {

    String breed; // Giống gì?
    String color; // Màu sắc

    public Dog() {
    }

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public Dog(String breed, String color, String name, float weight, float height) {
        super(name, weight, height);
        this.breed = breed;
        this.color = color;
    }

    // Nhập dữ liệu từ bàn phím
    public void init() {
        super.init();
        Scanner sc = new Scanner(System.in);
        System.out.print("Breed Dog: ");
        this.breed = sc.nextLine();
        System.out.print("Color Dog: ");
        this.color = sc.nextLine();
    }

    // Hiển thị dữ liệu
    public void display() {
        super.display();
        System.out.println("Breed Dog: " + this.breed
                + " | Color: " + this.color);
    }
}


