package B1;

import java.util.Scanner;

public class SHVuong {
    public static void main(String[] args) {
        System.out.println("Nhap do dai canh a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double SHV = a * a;
        System.out.println("Dien tich hinh vuong la: " + SHV);
    }
}
