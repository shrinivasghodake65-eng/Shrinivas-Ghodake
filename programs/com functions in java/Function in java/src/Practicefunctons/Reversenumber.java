package Practicefunctons;

public class Reversenumber {

    void print(int x)
    {
        if(x==0)
        {
            return;
        }
        System.out.println(x);
        print(x-1);
    }
     public static void main(String[] args) {

        Reversenumber r1=new Reversenumber();
        r1.print(20);





     }









}
