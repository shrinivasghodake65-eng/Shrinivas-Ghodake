package Factorialfunctions;

public class Test {

    int Factorial(int n)
    {
        if(n==0)
        {
            return 1 ;
        }

        return n * Factorial(n-1);
    }
    public static void main(String[] args) {

        Test t1= new Test();

        System.out.println(t1.Factorial(5));




    }





}
