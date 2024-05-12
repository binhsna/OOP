package Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Rectangle h1 = new Rectangle();
        h1.inputArr();
        System.out.println("Diện tích HCN là: " + h1.Area());

        Triangle tr1 = new Triangle();
        tr1.inputArr();
        System.out.println("Diện tích tam giác là: " + tr1.Area());
    }
}

// Đa giac
abstract class Polygon {
    int VerticesNum; // Số đỉnh
    float VerticesArr[]; // Mảng các đỉnh
    float Area; // Diện tích

    public Polygon() {
    }

    public Polygon(int VerticesNum, float VerticesArr[], float Area) {
        this();
        this.VerticesNum = VerticesNum;
        this.VerticesArr = VerticesArr;
        this.Area = Area;
    }

    public void inputArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dinh N = ");
        this.VerticesNum = sc.nextInt();
        this.VerticesArr = new float[this.VerticesNum];
        for (int i = 0; i < this.VerticesNum; i++) {
            System.out.print("Arr[" + i + "] = ");
            this.VerticesArr[i] = sc.nextFloat();
        }
    }

    public void outputArr() {
        System.out.println("Độ dài các cạnh: ");
        for (int i = 0; i < this.VerticesNum; i++) {
            System.out.println(VerticesArr[i] + " ");
        }
    }

    public abstract float Area();
}

// Class hình chữ nhật
class Rectangle extends Polygon {
    public Rectangle() {
    }

    // Nhập chiều dài và chiều rộng
    @Override
    public void inputArr() {
        //super.inputArr();
        this.VerticesNum = 2;
        this.VerticesArr = new float[this.VerticesNum];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài HCN: ");
        this.VerticesArr[0] = sc.nextFloat();
        System.out.print("Nhập chiều rộng HCN: ");
        this.VerticesArr[1] = sc.nextFloat();
    }

    @Override
    public float Area() {
        float mul = 1;
        for (int i = 0; i < VerticesNum; i++) {
            mul *= VerticesArr[i];
        }
        return mul;
    }
}

class Triangle extends Polygon {
    public Triangle() {
    }

    // Nhập 3 cạnh của tam giác
    @Override
    public void inputArr() {
        //super.inputArr();
        this.VerticesNum = 3;
        this.VerticesArr = new float[this.VerticesNum];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh thứ 1 của tam giác: ");
        this.VerticesArr[0] = sc.nextFloat();
        System.out.print("Nhập độ dài cạnh thứ 2 của tam giác: ");
        this.VerticesArr[1] = sc.nextFloat();
        System.out.print("Nhập độ dài cạnh thứ 3 của tam giác: ");
        this.VerticesArr[2] = sc.nextFloat();
    }

    @Override
    public float Area() {
        double p = 0;
        for (int i = 0; i < VerticesNum; i++) {
            p += VerticesArr[i];
        }
        p /= 2;
        float mul = (float) Math.sqrt(p * (p - VerticesArr[0])
                * (p - VerticesArr[1]) * (p - VerticesArr[2]));
        return mul;
    }
}