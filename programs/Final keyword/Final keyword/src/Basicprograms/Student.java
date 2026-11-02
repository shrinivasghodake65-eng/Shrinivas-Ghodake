package Basicprograms;

public class Student {

   String name ;


    void show(final String name)
    {
        System.out.println(name);
    }


    public static void main(String[] args) {

        Student s1=new Student ();
        s1.show("shrinivas");

    }
}
