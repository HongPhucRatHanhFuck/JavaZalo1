package B1;

import java.util.Scanner;

public class MetToFeet {
    public static void main(String[] args) {
        System.out.println("Nhap met chuyen sang feet");
        Scanner scanner = new Scanner(System.in);
        double met = scanner.nextDouble();
        double feet = met * 3.2808;
        System.out.println("Feet chuyen sang la: " + feet);
    }
}
