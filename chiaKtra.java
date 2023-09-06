package B1;

import java.util.Scanner;

public class chiaKtra {
    public static void main(String[] args) {
        System.out.println("Nhap so a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Nhap so b");
        int b = scanner.nextInt();
        double c = a / b;
        double d = a % b;
        if (a / b == 0) {
            System.out.println("So a chia het cho b co ket qua la: " + c );
        } else {
            System.out.println("So a khong chia het cho b va du: " + d);
        }
    }
}
