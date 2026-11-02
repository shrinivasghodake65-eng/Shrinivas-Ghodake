package Superkeywords.variable;

public class Student
{
     String name;
     int id;
     String gmail;

     void print()
     {
         System.out.println(name);
         System.out.println(id);
         System.out.println(gmail);
     }


}


class Teacher extends Student{

    String college;

    void show()
    {
        super.print();
        System.out.println(college);
    }
}

class Demo
{
    public static void main(String[] args) {
       Teacher t1=new Teacher();
       t1.name="shrinivas";
       t1.gmail="shree@gmail.com";
       t1.id=1234;
       t1.college="jvm murud";
       t1.show();





    }


}




