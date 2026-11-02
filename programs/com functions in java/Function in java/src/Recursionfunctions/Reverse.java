package Recursionfunctions;

public class Reverse {
    void print(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {

        Reverse r1=new Reverse ();

        r1.print(10);













    }














}
