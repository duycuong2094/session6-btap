package XayDungchucNangTinhToan;

public class ClasTinhToan {
    double a;
    double b ;

    public ClasTinhToan(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double tong(){
        return this.a+this.b;
    }
    public double tich(){
        return this.a*this.b;
    }
    public  double thuong(){
        return  this.a/this.b;
    }
    public  double hieu(){
        return this.a-this.b;
    }
}
