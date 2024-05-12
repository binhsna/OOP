package De1;

import java.util.ArrayList;
import java.util.List;

public class De1Run {
    public static void main(String[] args) {
        Container<matHang> c1 = new Container<>("Boong", 30);
        matHang a1 = new matHang("dien thoai", 10);
        c1.addMH(a1);
        //c1.displayMH();

        c1.display();

        conContainer cc1 = new conContainer();
        MatHangCon ac1 = new MatHangCon();
        ac1.ten = "May tinh bang";
        ac1.kichthuoc = 30;
        cc1.maHieu = "Dung";
        cc1.kt = 40;
        //cc1.t.add(ac1);
        cc1.addcc(ac1);
        cc1.display();
    }
}

class Container<T> {
    List<T> t;
    String maHieu;
    int kt;

    public Container() {
        t = new ArrayList<T>();
    }

    public Container(String maHieu, int kt) {
        this();
        this.maHieu = maHieu;
        this.kt = kt;
    }

    public List<T> getT() {
        return t;
    }

    public void setT(List<T> t) {
        this.t = t;
    }

    public String getMaHieu() {
        return maHieu;
    }

    public void setMaHieu(String maHieu) {
        this.maHieu = maHieu;
    }

    public int getKt() {
        return kt;
    }

    public void setKt(int kt) {
        this.kt = kt;
    }

    public void addMH(T a) {
        if (((matHang) a).kichthuoc <= this.kt) {
            t.add(a);
        }
    }

    public void displayMH() {
        for (int i = 0; i < t.size(); i++) {
            ((matHang) t.get(i)).display();
        }
    }

    public void display() {
        System.out.println("Ma container: " + maHieu + " |Kich thuoc: " + kt + " TEU");
        displayMH();
    }
}

class matHang {

    String ten;
    int kichthuoc;

    public matHang() {
    }

    public matHang(String ten, int kichthuoc) {
        this.ten = ten;
        this.kichthuoc = kichthuoc;
    }

    public void display() {
        System.out.println("Mat hang: " + ten + " |kich thuoc: " + kichthuoc + " TEU");
    }
}

class MatHangCon extends matHang {
}

class conContainer extends Container<MatHangCon> {

    public void addcc(MatHangCon a) {
        if (a.kichthuoc <= kt) {
            t.add(a);
        }
    }
}
