package Staticvariable;

public class Operations {
    static int x=20;
    static int y=5;

    static void operate()
    {
        x=x+y;
        System.out.println(x);
        x=x-y;
        System.out.println(x);
        x=x*y;
        System.out.println(x);
        x=x/y;
        System.out.println(x);
        x=x%y;
        System.out.println(x);
    }

    public static void main(String[] args) {

        operate();


    }


}
