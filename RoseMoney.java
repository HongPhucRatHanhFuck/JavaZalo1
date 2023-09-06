package B1;

import java.util.Scanner;

public class RoseMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tổng số tiền doanh thu");
        double doanhthu = scanner.nextDouble();
        System.out.println("Nhập số phần trăm hoa hồng quy định");
        double phantram = scanner.nextDouble();
        double hoahong = (doanhthu * phantram) / 100;
        System.out.println("Tổng số tiền hoa hồng nhận được là: " + hoahong);

    }
}
