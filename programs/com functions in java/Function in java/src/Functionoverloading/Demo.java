package Functionoverloading;

public class Demo {

    static int sum(double a,double b)
    {
        return (int)(a+b);
    }

    static void fun(String name)
    {
        System.out.println(name);
    }

    static void fun(int id)
    {
        System.out.println(id);
    }

    static int Test()
    {
        return 1;
    }


    public static void main(String[] args) {

      int x = sum(10,20);
        System.out.println(x);

        fun(1);
        fun("shrinivas");

        System.out.println(Test());



    }












}
