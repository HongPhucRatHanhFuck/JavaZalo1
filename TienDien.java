package B1;

import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kWh điện: ");
        double kWh = scanner.nextDouble();
        if (kWh <= 50) {
            double tienBac1 = 1.678 * kWh;
            System.out.println("Gia tien dien cua ban la " + tienBac1);
        } else if (kWh >= 51 && kWh < 100) {
            double tienBac2 = 1.786 * kWh;
            System.out.println("Gia tien dien cua ban la: " + tienBac2);

        }

    }
}
