package Recursionfunctions;

public class Principle {

    void printnum(int n)
    {
        if(n==0)
        {
            return;
        }
        printnum(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        Principle p1=new Principle();
       p1.printnum(5);





    }




















}
