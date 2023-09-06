package B1;

import java.util.Scanner;

public class ktraTuoi {
    public static void main(String[] args) {
        System.out.println("Vui long nhap tuoi cua ban ");
        Scanner scanner = new Scanner(System.in);
        int tuoi = scanner.nextInt();
        if(tuoi < 15){
            System.out.println("Ban van chua du tuoi de hoc lop 10");
        } else {
            System.out.println("Chuc mung, ban da du tuoi de hoc lop 10");
        }
    }
}
