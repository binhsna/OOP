package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // a) Nhap so nguyen N
        System.out.print("Nhap gia tri so nguyen N = ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Gia tri cua N = " + N);
        // b) Nhap mang A[N] va xuat mang A[N]
        int A[] = new int[N];
        // Input
        System.out.println("Input Array A: ");
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }
        // Output
        System.out.println("Array A: ");
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println("");
        // c) Nhap mang B[N][N] va xuat mang B[N][N]
        int B[][] = new int[N][N];
        // Input
        System.out.println("Input Array B: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("B[" + i + "]" + "[" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }
        // Output
        System.out.println("Array B: ");
        for (int b[] : B) {
            for (int i : b) {
                System.out.print(i + " ");
            }
        }
        // Tinh trung binh cong cac B[i][j]
        System.out.println("");
        float avg = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                avg += B[i][j];
            }
        }
        System.out.println("Sum of elements of B: " + (int) avg);
        avg /= (float) (N * N);
        System.out.println("Average Of elements Of B: " + avg);
        // d) Nhap vao 2 chuỗi S và T
        String S, T;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nhap vao chuoi S: ");
        S = sc1.nextLine();

        System.out.print("Nhap vao chuoi T: ");
        T = sc1.nextLine();

        System.out.println("Tong do dai 2 chuoi S va T la: " + (S.length() + T.length()));
        // Kiểm tra xem chuỗi S có nằm trong chuỗi T hay không
        if (T.contains(S)) {
            System.out.println("Vi tri chuoi S trong chuoi T la: " + T.indexOf(S));
        }
    }
}
