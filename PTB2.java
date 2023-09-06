package B1;

import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        System.out.println("Giai pt bac 2: a * x^2 - bx +c =0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: " + x1);
            System.out.println("Phuong trinh co 2 nghiem phan biet: " + x2);
        } else if (delta == 0) {
            double kep = -b / 2 * a;
            System.out.println("Phuong trinh co nghiem kep x1 = x2 " + kep);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
