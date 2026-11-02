package Recursionfunctions;

public class even {

    void printnum(int n)
    {
        if(n==0)
        {
            return;
        }
        printnum(n-1);
        if(n%2==0)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {

        even e1=new even();

        e1.printnum(10);















    }


}
