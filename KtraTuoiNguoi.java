package B1;

import java.util.Scanner;

public class KtraTuoiNguoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuoi de kiem tra");
        int tuoi = scanner.nextInt();
        if (tuoi > 0 && tuoi < 120) {
            System.out.println(tuoi + " Day la con nguoi");
        } else {
            System.out.println(tuoi + " Day khong phai la con nguoi");
        }
    }
}
