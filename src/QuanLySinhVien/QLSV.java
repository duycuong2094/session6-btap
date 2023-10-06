package QuanLySinhVien;

import java.util.Scanner;

public class QLSV {
   static Scanner scanner = new Scanner(System.in);
   static int id=0;
  static   Student[] students=new Student[100];

    public static void main(String[] args) {
        boolean out = true;
        while (out){
            System.out.println("Nhập số để :");
            System.out.println("0 . Hiển thị thông tin học sinh");
            System.out.println("1 . Thêm mới sinh viên");
            System.out.println("2 . Sửa thông tin bằng mã học sinh");
            System.out.println("3 . Xóa học sinh");
            System.out.println("4 . Thoát");
            int nhap=Integer.parseInt(scanner.nextLine());
            handle(nhap);
        }
}

    private static void handle( int nhap) {
        switch (nhap){
            case 0:
                DisplayRender();
                break;
            case 1:
                AddStudent();
                break;
            case 2:
                UpdateStudent();
                break;
            case 3:
                DeleteStudent();
                break;
            case 4:
                Out();
            default:
    }
    }

    private static void DisplayRender() {
        System.out.println("Danh Sách Tất cả sinh viên là");
        for (int i =0;i<id;i++){
            students[i].DisplayStudent();
            return;
        }
    }
    private  static void AddStudent(){
        Student student = new Student();
        student.inputData(scanner);
        students[id++]=student;
        return;
    }
    private  static void UpdateStudent(){
        System.out.println("Nhập index muốn sửa");
        int Edit=Integer.parseInt(scanner.nextLine());
        for (int i =0;i<id;i++){
            if (Edit==students[i].getStudentId()){
                System.out.println("Thông tin của học sinh muốn sửa là");
                students[i].DisplayStudent();
                students[i].inputData(scanner);
                System.out.println("Đã cập nhập thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy id bạn vừa nhập");
    }
    private  static void DeleteStudent(){
        System.out.println("Nhập id bạn muốn xóa");
        int dele = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ;i<id;i++){
            if (dele==students[i].getStudentId()){
                for (int j=i;j<id;j++){
                    students[j]=students[j++];
                    id--;
                    System.out.println("Xóa thành công");
                    return;
                }
            }
            System.out.println("Không tìm thấy vị trí id");
        }
    }
    private static void Out(){;
    }

}

