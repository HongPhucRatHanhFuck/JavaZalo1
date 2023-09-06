package B1;

import java.util.Scanner;

public class KtraSo0 {
    public static void main(String[] args) {
        System.out.println("Vui long nhap so");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a > 0) {
            System.out.println("So ban vua nhap lon hon 0" + a);
        } else {
            System.out.println("So ban vua nhap vao nho hon 0" + a);
        }
    }
}
