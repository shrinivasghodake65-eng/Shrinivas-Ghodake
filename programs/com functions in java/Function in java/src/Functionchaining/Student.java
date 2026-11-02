package Functionchaining;

public class Student {

    void fun()
    {
        fun2();
        System.out.println("by");
    }
    void fun2()
    {
        fun3();
        System.out.println("how are you");
    }
    void fun3()
    {
        System.out.println("hello");

    }

    public static void main(String[] args) {

        Student s1=new Student();

        s1.fun();











    }




}
