package QuanLySinhVien;

import java.util.Scanner;

public class Student {
    private  int studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private  String address;
    private  String PhoneNumber;
    private static int cout =1;
    public  Student(){
        this.studentId=Student.cout++;

    }
    public void inputData(Scanner scanner){
        System.out.println("Nhập thông tin sinh viên");
        System.out.println("Hãy Nhập mã Sinh Viên");
        this.studentId=Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập tên sinh viên");
        this.studentName=scanner.nextLine();
        System.out.println("Hãy nhập tuổi sinh viên");
        this.age=Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập giới tính sinh viên");
        this.gender=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Hãy nhập địa chỉ sinh viên");
        this.address=scanner.nextLine();
        System.out.println("Hãy Nhập số điện thoại");
        this.PhoneNumber=scanner.nextLine();
    }
    public void DisplayStudent(){
        String displayStudent="id"+ studentId+
                " Tên: " + studentName +
                " Tuổi: " + age+
                " Gioi Tính: " + gender +
                "Địa Chỉ : " + address +
                "Số điện thoại " + PhoneNumber ;
        System.out.println(displayStudent);
    }

    public int getStudentId() {
        return studentId;
    }
}
