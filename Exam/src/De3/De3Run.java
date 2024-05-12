package De3;

import java.util.Scanner;

public class De3Run {
    public static void main(String[] args) {
        // Robot r1 = new Robot();
        // System.out.println("Nhập thông tin của TransportRobot");
        // r1 = new TransportRobot();
        // r1.setting();
        // r1.display();

        System.out.println("Factory 1");
        Factory f1 = new Factory(1);
        //f1.init();
        f1.initRobotTransportRobot();
        f1.display();

        System.out.println("Factory 2");
        Factory f2 = new Factory(1);
        f2.init();
        f2.display();
    }
}

class Robot {
    private String name;
    private String makein;
    private float weight;
    private int year; // năm xuất xưởng

    public Robot() {
    }

    public Robot(String name, String makein, float weight, int year) {
        this();
        this.name = name;
        this.makein = makein;
        this.weight = weight;
        this.year = year;
    }

    // Nhập các thuộc tính từ bàn phím
    public void setting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Makein: ");
        this.makein = sc.nextLine();
        System.out.print("Weight: ");
        this.weight = sc.nextFloat();
        System.out.print("Year: ");
        this.year = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + this.name + " |Makein: " + this.makein
                + " |Weight: " + this.weight + " tấn" + " |Year: " + this.year);
    }
}

class Factory {
    Robot robots[];
    int number;

    public Factory(int n) {
        this.number = n;
        robots = robots = new Robot[this.number];
    }

    public void init() {
        for (int i = 0; i < this.number; i++) {
            this.robots[i] = new Robot();
            System.out.println("----------------------------");
            System.out.println("Nhập thông tin Robot thứ " + (i + 1));
            this.robots[i].setting();
        }
    }

    public void initRobotTransportRobot() {
        for (int i = 0; i < this.number; i++) {
            this.robots[i] = new TransportRobot();
            System.out.println("----------------------------");
            System.out.println("Nhập thông tin Transport Robot thứ " + (i + 1));
            this.robots[i].setting();
        }
    }

    public void display() {
        for (int i = 0; i < this.number; i++) {
            System.out.println("----------------------------");
            System.out.println("Hiển thị thông tin Robot thứ " + (i + 1));
            this.robots[i].display();
        }
        System.out.println("--------- Kết thúc ---------");
    }
}

class TransportRobot extends Robot {

    float velocity; // Vạn tốc

    public TransportRobot() {
    }

    public TransportRobot(float velocity) {
        this.velocity = velocity;
    }

    public TransportRobot(String name, String makein,
                          float weight, int year, float velocity) {
        super(name, makein, weight, year);
        this.velocity = velocity;
    }

    public void setting() {
        super.setting();
        System.out.print("Velocity: ");
        Scanner sc = new Scanner(System.in);
        this.velocity = sc.nextFloat();
    }

    public void display() {
        super.display();
        System.out.println("Velocity: " + this.velocity + " km/h");
    }
}

