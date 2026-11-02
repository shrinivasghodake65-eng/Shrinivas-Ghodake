package Practicefunctons;

public class Total {

    int test(int a)
    {
        if(a==0)
        {
            return 0;
        }

        return a+test(a-1);
    }

    public static void main(String[] args) {

        Total t1=new Total();

        System.out.println(t1.test(10));















    }










}
