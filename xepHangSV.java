package B1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class xepHangSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem toan");
        double diemToan = scanner.nextDouble();
        System.out.println("Nhap diem van");
        double diemVan = scanner.nextDouble();
        System.out.println("Nhap diem Anh");
        double diemAnh = scanner.nextDouble();

        double TBM = (diemToan + diemVan + diemAnh ) / 3;

        if (TBM > 8.0){
            System.out.println(TBM + " Sinh vien dat hoc sinh gioi");
        } else if (TBM > 6.8 && TBM <7.5) {
            System.out.println(TBM + " Sinh vien dat hoc sinh kha");
        } else {
            System.out.println(TBM + " Sinh vien dat hoc sinh trung binh");
        }
    }
}
