package XayDungchucNangTinhToan;

import java.util.Scanner;

public class tinhtoan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập Số a");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b");
        double b = scanner.nextInt();
        ClasTinhToan clasTinhToan=new ClasTinhToan(a,b);
        System.out.println("Tổng hai số là "+ clasTinhToan.tong());
        System.out.println("Tích Hai Số là "+ clasTinhToan.tich());
        System.out.println("Thương hai số là "+clasTinhToan.thuong());
        System.out.println("Hiệu 2 số là "+clasTinhToan.hieu());
    }
}
