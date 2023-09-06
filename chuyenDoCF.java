package B1;

import java.util.Scanner;

public class chuyenDoCF {
    public static void main(String[] args) {
        System.out.println("Nhap do C de chuyen sang do F");
        Scanner scanner = new Scanner(System.in);
        double doC = scanner.nextDouble();
        double doF = (doC * 9 / 5) + 32;
        System.out.println("Do F la: " + doF);
    }
}
