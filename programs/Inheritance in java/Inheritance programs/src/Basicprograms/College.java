package Basicprograms;

public class College {

    String collegename;
    int id;

    void print()
    {
        System.out.println("college student");
    }
}

class Teacher extends College {

    void show()
    {
        System.out.println("College teacher");
    }




}