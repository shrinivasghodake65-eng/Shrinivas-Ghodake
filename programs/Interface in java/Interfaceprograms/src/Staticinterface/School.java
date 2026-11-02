package Staticinterface;

public interface School {

    static void m1()
    {
        System.out.println("static method");
    }

    private void m2()
    {
        m1();
        System.out.println("private method");
    }

    default void m3()
    {
        m2();
        System.out.println("default method");
    }




}
