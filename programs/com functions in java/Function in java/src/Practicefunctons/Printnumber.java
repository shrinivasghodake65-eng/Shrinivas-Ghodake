package Practicefunctons;

public class Printnumber {


    void show(int a)
    {
        if(a==0)
        {
            return;
        }
        show(a-1);
        System.out.println(a);

    }
    public static void main(String[] args) {
        Printnumber p1=new Printnumber();

        p1.show(20);
    }












}
