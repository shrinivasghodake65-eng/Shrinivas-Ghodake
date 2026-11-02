package Staticvariable;

public class Counter {

    static int count=10;

    Counter()
    {
        count++;
    }

    public static void main(String[] args) {

         Counter c1=new Counter();
        System.out.println(count);

    }












}
