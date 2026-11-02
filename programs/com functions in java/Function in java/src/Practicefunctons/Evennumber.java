package Practicefunctons;

public class Evennumber {


    void number(int n)
    {
        if(n==0)
        {
            return ;
        }

        number(n-1);

        if(n%2==0)
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

       Evennumber e1=new Evennumber();

        e1.number(20);







    }








}
