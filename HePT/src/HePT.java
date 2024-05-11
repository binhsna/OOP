import java.util.Scanner;

public class HePT {
    /*
     Giải hệ phương trình nhiều ẩn theo phương pháp Cramer
     (n phương trình n ẩn) - sử dụng định thức.
    - Nếu hệ có số phương trình ít hơn số ẩn -> Hệ vô số nghiệm.
    - Nếu hệ có tất cả định thức chính và định thức thứ i = 0
     -> Hệ có thể có vô số nghiệm hoặc vô nghiệm.
    - Nếu hệ có định thức = 0, tồn tại định thức thứ i nào đó khác 0
     -> Hệ vô nghiệm.
    - Nếu hệ có định thức chính khác 0, hệ có nghiệm duy nhất.
   Nội dung thực hiện:
      Nhập vào ma trận hệ phương trình.
      Tiến hành tính các định thức thứ i và đinh thức chính.
      kết luận nghiệm dựa trên định thức theo những điều kiện trên.
   VD: Giải hệ phương trình sau:
        4x + 7y = 16
        4x - 3y = -24
      --> Nhập đầu vào thành ma trận:
      4  7   16
      4 -3  -24
      --> Nghiệm: (x, y) = (-3, 4)
     */
    public static void main(String[] args) {
        int[][] arr = input();
        action(arr);
    }

    // Tiến hành giải hệ
    static void action(int[][] arr) {
        System.out.println("-- Giải --");
        int d1 = arr.length;
        int d2 = arr[0].length;
        if (d2 > d1 + 1) {
            System.out.println("Vô số nghiệm.");
        } else {
            int[] d = new int[d1];
            for (int i = 0; i < d1; i++) {
                d[i] = arr[i][d2 - 1];
            }
            int[][] matrix = copy(arr);
            int res = det(matrix);
            int[] dt = new int[d1];
            for (int k = 0; k < d1; k++) {
                int[][] matrix1 = copy(arr);
                for (int i = 0; i < d1; i++) {
                    matrix1[i][k] = d[i];
                }
                dt[k] = det(matrix1);
            }

            boolean b = false;
            for (int i = 0; i < d1; i++) {
                if (dt[i] != 0) {
                    b = true;
                    break;
                }
            }
            if (b && res == 0) {
                System.out.println("Vô nghiệm.");
            } else if (!b && res == 0) {
                System.out.println("Vô số nghiệm hoặc vô nghiệm");
            } else {
                System.out.print("Nghiệm của phương trình là: (");
                for (int i = 0; i < d1; i++) {
                    System.out.print("x" + i);
                    if (i < d1 - 1) System.out.print(", ");
                    if (i == d1 - 1) System.out.println(")");
                }
                for (int i = 0; i < d1; i++) {
                    System.out.println("x" + i + " = " + (double) dt[i] / res);
                }
            }
        }
    }

    static int[][] copy(int[][] arr) {
        int[][] a = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                a[i][j] = arr[i][j];
            }
        }
        return a;
    }

    // Nhập vào thông tin ma trận của hệ
    static int[][] input() {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Nhập vào ma trận phương trình --");
        System.out.print("Số hàng (Số ẩn): ");
        m = sc.nextInt();
        System.out.print("Số cột (Số ẩn + 1 cột vế phải): ");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    // Tính và trả về định thức
    static int det(int[][] arr) {
        if (arr.length == 1) {
            return arr[0][0];
        }
        if (arr.length == 2) {
            return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        } else {
            int res = 0;
            try {
                for (int k = 0; k < arr.length; k++) {
                    int[][] smaller = new int[arr.length - 1][arr.length - 1];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 1; j < arr.length; j++) {
                            if (j < k) {
                                smaller[i][j - 1] = arr[i][j];
                            } else if (i > k) {
                                smaller[i - 1][j - 1] = arr[i][j];
                            }
                        }
                    }
                    int s = -1;
                    if (k % 2 == 0) {
                        s = 1;
                    }
                    res += arr[k][0] * s * det(smaller);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            return res;
        }
    }
}
