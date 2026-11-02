package Constructoroverloading;

public class Collage {

    Collage()
    {
        this("shree");
        System.out.println("default constructor");
    }

    Collage(String name)
    {
        this(101,1234);
        System.out.println(" 1 parameterized constructor");
    }

    Collage(int id,int password)
    {
        System.out.println("2 parameterized constructor");
    }

    public static void main(String[] args) {

        Collage c1=new Collage();

    }












}
