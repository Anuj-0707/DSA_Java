package OOPs;
class Cal_Frac{
    int num;
    int den;
    Cal_Frac(){

    }
    Cal_Frac(int num,int den){
        if(den==0){System.out.println("Denominator cannot be zero");
            return;
        }
        this.num=num;
        this.den=den;
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Cal_Frac f){
        int upper = (num*f.den + f.num*den);
        int lower = den*f.den;
        simplify(upper,lower);
    }
    void multiply(Cal_Frac f){
        int upper = num*f.num;
        int lower = den*f.den;
        simplify(upper,lower);
    }
    void divide(Cal_Frac f){
        int upper =num*f.den;
        int lower =den*f.num;
        simplify(upper,lower);
    }
    void simplify(int x,int y){
        int gcd = hcf(x,y);
        this.num = x/gcd;
        this.den = y/gcd;
    }
    int hcf(int x,int y){
        int result = 1;
        int t = Math.min(x,y);
        for(int i=2;i<=t;i++){
            if(x%i==0 && y%i==0){
                result = i;
            }
        }
        return result;
    }
}
public class Fraction {
    public static void main(String[] args) {
        Cal_Frac f1 = new Cal_Frac(3, 3);
        Cal_Frac f2 = new Cal_Frac(1, 0);
        f1.print();
        f2.print();
        f1.multiply(f2);
        f1.print();
    }
}
