package Practicefunctons;

public class Oddnumber {

    void print(int x)
    {

        if(x==0)
        {
            return;
        }

        print(x-1);
        if(x%2!=0)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        Oddnumber o1= new Oddnumber();

        o1.print(20);



    }










}
