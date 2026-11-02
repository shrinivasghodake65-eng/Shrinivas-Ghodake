package Staticvariable;

public class Parameter {

    static int x;
    static int y;

    static void print(int x ,int y)
    {
        x=x+y;
        System.out.println(x);
    }

    public static void main(String[] args) {

        print(10,20);


    }



}
