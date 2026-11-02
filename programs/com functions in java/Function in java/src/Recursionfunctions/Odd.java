package Recursionfunctions;

public class Odd {

    void test(int n)
    {
        if(n==0)
        {
            return ;
        }
        test(n-1);
        if(n%2!=0)
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

       Odd o1=new Odd();
        o1.test(10);



    }






}
