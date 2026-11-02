package Functionoverloading;

public class Test {

    public static void main(String[] args) {

       int x= sum(10,20);
        System.out.println(x);

        int y=sum(40,50);
        System.out.println(y);

        int z=sum(80,80);
        System.out.println(z);

        int a=sum1(20,30,40);
        System.out.println(a);

        greet("shrinivas",1);

    }

    static int sum(int a,int b)
    {
        return (a * b);
    }

    static int sum1(int a,int b,int c)
    {
        return(a+b+c);
    }

    static void greet(String name,int id)
    {
        System.out.println("hi: " + name + " your id =" + id);
    }







}
