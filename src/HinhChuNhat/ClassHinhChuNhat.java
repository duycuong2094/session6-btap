package HinhChuNhat;

public class ClassHinhChuNhat {
    double width,height;
    public ClassHinhChuNhat(){

    };

    public ClassHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double ChuViHcn(){
     return    (this.height+this.width)*2;
    };
    public double Shcn(){
        return this.height*this.width;
    }
}
