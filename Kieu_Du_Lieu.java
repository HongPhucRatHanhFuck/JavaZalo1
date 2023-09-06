package B1;

import java.util.Scanner;

public class Kieu_Du_Lieu {
    public static void main(String[] args) {
        //1 int a = 1000;
        //System.out.println(a);
        //2 nhap vao kieu int va in ra so do
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap so: ");
//        int a = input.nextInt();
//        System.out.println("So vua nhap la: " + a);
        //3 nhap vao 2 bien kieu int va in ra tong, tich, hieu, thuong, so du
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap lan luot cac so a va b");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println("so a la: " + a + " so b la: " + b);
//        int c = a + b;
//        int d = a - b;
//        int e = a * b;
//        int f = a / b;
//        int g = a % b;
//        System.out.println("Ket qua la: " + g);
        //4 Nhap ten tuoi in ra ten tuoi
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("Ten cua ban la: ");
        String name = inputString.nextLine();
        System.out.println("Tuoi cua ban la:  ");
        int age = inputNumber.nextInt();
        System.out.println("Xin chao " + name + " Toi nam nay " + age);
    }
}
