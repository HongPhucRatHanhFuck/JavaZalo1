package B1;

import java.util.Scanner;

public class STamGiacVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh b");
        double b = scanner.nextDouble();

        double S = (double) 1 /2 * (a * b);
        System.out.println("Dien tich tam giac vuong la: " + S);
    }
}
