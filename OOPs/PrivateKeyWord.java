package OOPs;
class Student {
    String name;
    private long rno;// private things can not be printed or input given.
    double cgpa;
    long getRno(){//getter
        return rno;
    }
    void setRno(long x){//setter
        rno = x;
    }
}
public class PrivateKeyWord {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.cgpa=9.05;
        s1.name="Anuj Pandey";
        s1.setRno(2401330130057l);
        System.out.println("Name :- "+s1.name+"\nRoll Number:- "+s1.getRno()+"\nCgpa:- "+s1.cgpa);
    }
}
