package BaiTap.PhuongTrinhBac2;

public class ClassPhuongTrinhBac2 {
    private int a;
    private int b;
    private int c;

    public ClassPhuongTrinhBac2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    };

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double delta(){
        return this.b*this.b-4*this.a*this.c;
    };
    public double   nghiem1(){
        return (this.b*(-1)+Math.sqrt(this.b*this.b-(4*this.a*this.c)))/(2*this.a);
    }
    public double nghiem2(){
        return (this.b*(-1)-Math.sqrt(this.b*this.b-(4*this.a*this.c)))/(2*this.a);

    }
}
