package BaiTap.PhuongTrinhBac2;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = scanner.nextInt();
        System.out.println("Nhập b");
        int b = scanner.nextInt();
        System.out.println("Nhập c");
        int c = scanner.nextInt();
        ClassPhuongTrinhBac2 classPhuongTrinhBac2 = new ClassPhuongTrinhBac2(a, b, c);
        if (classPhuongTrinhBac2.delta() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (classPhuongTrinhBac2.delta() == 0) {
            System.out.println("Phương trình có nghiệm duy nhất" + -b / 2 * a);
        } else {
            System.out.println("Phương trình có 2 nghiêm là" + classPhuongTrinhBac2.nghiem1() + "  " + classPhuongTrinhBac2.nghiem2());
        }

    }
}
