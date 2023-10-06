package XayDungLopHocSinh;

public class ClasStudent {
   int MHS;
   String name;
   int age;
   Boolean sex;
   String ClassRoom;
   String address;

    public ClasStudent(int MHS, String name, int age, Boolean sex, String aClass, String address) {
        this.MHS = MHS;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ClassRoom = ClassRoom;
        this.address = address;
    };
    public String thongtin(){
        return
                " Mã so hoc sinh: "+MHS
                +" Tên :"+ name
                +" tuổi "+age
                +" Gioi tinh "+(sex?"nam":"nữ")
                +" Lớp "+ ClassRoom
                +" Địa chỉ "+address;
    }
}
