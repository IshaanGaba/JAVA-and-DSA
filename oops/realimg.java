package oops;

public class realimg {
    public static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex();
        c1.setr(5);
        c1.seti(5);
        c2.setr(5);
        c2.seti(5);
        c1.sum(c1,c2);

    }
}
class Complex{
    private int r;
    private int i;
    void setr(int r){
        this.r=r;
    }
    void seti(int i){
        this.i=i;
    }
    void sum(Complex c1,Complex c2){
        int x=c1.r+c2.r;
        int y=c1.i+c2.i;
        System.out.println(x+" + "+y+" i");
    }
    void diff(Complex c1,Complex c2){
        int x=c1.r-c2.r;
        int y=c1.i-c2.i;
        System.out.println(x+" i"+y);
    }
    void pro(Complex c1,Complex c2){
        int x=(c1.r)*(c2.r);
        int y=(c1.r)*(c2.i);
        int z=(c1.i)*(c2.r);
        int w=(c1.i)*(c2.i);
        int a=x-w;
        int b=y+z;
        System.out.println(a+" i"+b);
    }
}
