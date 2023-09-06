package B1;

import java.util.Scanner;

public class intMax {
    public static void main(String[] args) {
        System.out.println("Nhap cac so nguyen bat ki");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c");
        double c = scanner.nextDouble();

        if (a > b && a > c){
            System.out.println("a la so lon nhat " + a);
        } else if (b > a && b > c) {
            System.out.println("b la so lon nhat " + b);
        } else if (c > a && c > b) {
            System.out.println("c la so lon nhat " + c);
        }
    }
}
