package Finalparameter;

public class Test {

    final String name="ghodake";

    void name(final String name)
    {
        System.out.println(name);
    }


    public static void main(String[] args) {
         Test t1=new Test();

        t1.name(t1.name);

    }






}
