package Basicprograms;

public class Student {

    String name;
    int id;
    int rollno;
   static String collage;

    Student(String name,int id ,int rollno)
    {
        this.name=name;
        this.id=id;
        this.rollno=rollno;

    }

    public static void main(String[] args) {

        Student s1=new Student("shrinivas",1234,1);

        Student s2=new Student("om",2345,2);

        Student.collage="jvm Murud";

        System.out.println(s1.name+","+s1.id+","+s1.rollno+","+s1.collage);
        System.out.println(s2.name+","+s2.id+","+s2.rollno+","+s2.collage);
    }











}
