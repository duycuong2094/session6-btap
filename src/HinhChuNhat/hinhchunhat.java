package HinhChuNhat;

import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        double width=scanner.nextDouble();
        System.out.println("Nhập chiều dài");
        double height=scanner.nextDouble();
        ClassHinhChuNhat hcn=new ClassHinhChuNhat(width,height);
        System.out.println("Chu vi hình chữ nhật là "+ hcn.ChuViHcn());
        System.out.println("Diện tích hình chữ nhật là "+hcn.Shcn());
    }

}
