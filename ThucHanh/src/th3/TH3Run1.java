package th3;

import java.util.ArrayList;
import java.util.Scanner;

public class TH3Run1 {
    public static void main(String[] args) {
        DaGiac r1 = new ChuNhat();
        r1.init(2);
        System.out.println("Diện tích HCN: " + r1.DienTich());
        //a1.display();
        DaGiac t1 = new TamGiac();
        t1.init(3);
        System.out.println("Diện tích tam giác: " + t1.DienTich());
        t1.display();
    }
}

class Point {

    float x;
    float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

abstract class DaGiac {

    int numV; // Số đỉnh của da giác
    ArrayList<Point> arrayP;
    float s;

    public DaGiac() {
        arrayP = new ArrayList();
    }

    // Lớp nhập đỉnh từ tham số
    public void init(int N) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Nhập số đỉnh của đa giác: ");
        // this.numV = sc.nextInt();
        this.numV = N;
        // Nhập tọa độ x,y cho từng đỉnh
        for (int i = 0; i < this.numV; i++) {
            System.out.print("Nhập tọa độ x của đỉnh thứ " + i + ": ");
            float x = sc.nextFloat();
            System.out.print("Nhập tọa độ y của đỉnh thứ " + i + ": ");
            float y = sc.nextFloat();

            Point p = new Point(x, y);
            arrayP.add(p);

        }
    }

    // Lớp xuất danh sách đỉnh
    public void display() {
        for (Point p : this.arrayP) {
            System.out.println(p.x + " " + p.y);
        }
    }

    // Lớp trừu tượng tính diện tích đa giác
    abstract float DienTich();
}

class ChuNhat extends DaGiac {

    public ChuNhat() {
    }

    public void init() {
        super.init(2);
    }

    @Override
    float DienTich() {
        Point p1 = arrayP.get(0);
        Point p2 = arrayP.get(1);
        this.s = Math.abs(p1.x - p2.x) * Math.abs(p1.y - p2.y);
        return s;

    }

}

class TamGiac extends DaGiac {

    public TamGiac() {
    }

    public void init() {
        super.init(3);
    }

    @Override
    float DienTich() {
        float ab, bc, ac;
        Point p1 = arrayP.get(0);
        Point p2 = arrayP.get(1);
        Point p3 = arrayP.get(2);
        ab = (float) Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        bc = (float) Math.sqrt(Math.pow((p1.x - p3.x), 2) + Math.pow((p1.y - p3.y), 2));
        ac = (float) Math.sqrt(Math.pow((p2.x - p3.x), 2) + Math.pow((p2.y - p3.y), 2));
        float p = (float) (ab + bc + ac) / 2;
        this.s = (float) Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        return s;

    }
}

