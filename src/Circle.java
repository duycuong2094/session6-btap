import java.util.Scanner;

public class Circle {
    private  double radius;
    private String color;
    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double tinhChuvi(){
        return 2*Math.PI*this.radius;
    }
    public  double tinhS(){
        return Math.PI*this.radius*this.radius;
    }
    public void disPlayData(){
        System.out.println("Hình tròn có các thuộc tính là r="+this.radius+"Màu sắc"+this.color);
    };
    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập bán kính");
        this.radius=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập thông tin màu sắc");
        this.color=scanner.nextLine();
    }
}
