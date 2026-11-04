package OOPs;
class Complex{
    double x;
    double y;
    Complex(){

    }
    Complex(double x,double y){// x is real and y is imaginary.
        this.x=x;
        this.y=y;
    }
    void print(){
        if(y>=0)System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
    void add(Complex z){
        this.x+=z.x;
        this.y+=z.y;
    }
    void multiply(Complex z){
        double real=(x*z.x - y*z.y);
        double img=(x*z.y + y*z.x);
        this.x=real;
        this.y=img;
    }
    void divide(Complex z){
        double div = (z.x*z.x + z.y*z.y);
        double real = (x*z.x + y*z.y)/div;
        double img = (y*z.x - x*z.y)/div;
        this.x = real;
        this.y = img;

    }
}
public class Complexnumber {
    public static void main(String[] args) {
        Complex z1 = new Complex(2,-5);
        z1.print();
        Complex z2 = new Complex(3, 4);
        z2.print();
        z1.divide(z2);
        z1.print();
    }
}
