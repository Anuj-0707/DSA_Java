package OOPs;
class Cars{
    int seats;
    String name;
    double length;
    Cars(){//default contructors
        
    }
    Cars(int x,String s, double l){// parameterised contructor
        seats=x;
        name=s;
        length=l;
    }
    void print(){
        System.out.println(seats+", "+name+", "+length);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Cars c1 = new Cars(5,"Swift",17.25);
        c1.print();
        Cars c2 = new Cars(5,"Alto",15.625);
        c2.print();
    }
}