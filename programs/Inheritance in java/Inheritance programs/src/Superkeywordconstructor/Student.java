package Superkeywordconstructor;

public class Student {

    String name;
    int id;
    String gmail;

    Student(String name, int id, String gmail)
    {
        this.name=name;
        this.id=id;
        this.gmail=gmail;
    }

    void show() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(gmail);
    }
}

class Test extends Student{

    String college;

    Test(String name,int id,String gmail,String college)
    {
        super(name,id,gmail);
        this.college=college;
    }

    void print()
    {
        show();
        System.out.println(college);
    }
public static void main(String[] args) {

        Test t1=new Test("shrinivas",1234,"shree2gmail.com","jvm murud");

        t1.print();


}




}