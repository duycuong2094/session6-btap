package XayDungLopHocSinh;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã số học sinh");
        int mhs = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn lại trong bộ đệm

        System.out.println("Nhập tên học sinh:");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi học sinh");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn lại trong bộ đệm

        System.out.println("Nhập giới tính (true/false):");
        boolean sex = scanner.nextBoolean();
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn lại trong bộ đệm

        System.out.println("Nhập lớp:");
        String lop = scanner.nextLine();

        System.out.println("Nhập Địa Chỉ:");
        String address = scanner.nextLine();

        ClasStudent clasStudent = new ClasStudent(mhs, name, age, sex, lop, address);
        System.out.println(clasStudent.thongtin());

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}
