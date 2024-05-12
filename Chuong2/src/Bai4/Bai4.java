package Bai4;

import Bai4.utils.ConvertTool;

public class Bai4 {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject(10f, 2);
        subs[1] = new Subject(8f, 3);
        subs[2] = new Subject(7f, 2);
        System.out.println(ConvertTool.Grade(subs));
    }
}
