package B1;

import java.util.Scanner;

public class SHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh b");
        double b = scanner.nextDouble();

        double S = a * b;
        System.out.println("Dien tich hinh chu nhat la: " + S);
    }
}
