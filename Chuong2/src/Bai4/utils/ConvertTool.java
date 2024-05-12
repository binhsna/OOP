package Bai4.utils;

import Bai4.Subject;

public class ConvertTool {
    static final float minGrade = 2f; // Điểm tối thiểu để ra trường

    // Hàm chuyển đổi điểm hệ 10 sang hệ 4
    public static float NormalToFour(float d) {
        if (d < 4) {
            return 0;
        } else if (d < 5) {
            return 1;
        } else if (d < 5.5) {
            return 1.5f;
        } else if (d < 6.5) {
            return 2;
        } else if (d < 7) {
            return 2.5f;
        } else if (d < 8) {
            return 3;
        } else if (d < 8.5) {
            return 3.5f;
        } else {
            return 4;
        }
    }

    // Hàm chuyển đổi điểm hệ 4 sang ký tự ABCDF
    public static String FourToABCDF(float d) {
        if (d < 4) {
            return "F";
        } else if (d < 5) {
            return "D";
        } else if (d < 5.5) {
            return "D+";
        } else if (d < 6.5) {
            return "C";
        } else if (d < 7) {
            return "C+";
        } else if (d < 8) {
            return "B";
        } else if (d < 8.5) {
            return "B+";
        } else {
            return "A";
        }
    }

    public static boolean Grade(Subject subs[]) {
        float sum_DiemMH = 0;
        int sum_SoTC = 0;
        for (int i = 0; i < subs.length; i++) {
            float d = NormalToFour(subs[i].DiemMH);
            sum_DiemMH += d * subs[i].SoTC;
            sum_SoTC += subs[i].SoTC;
        }
        float tb = sum_DiemMH / sum_SoTC;
        if (tb < minGrade) {
            return false;
        } else {
            return true;
        }
    }
}
