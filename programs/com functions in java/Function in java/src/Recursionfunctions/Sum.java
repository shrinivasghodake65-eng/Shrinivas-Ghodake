package Recursionfunctions;

public class Sum {

    int number(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return n +number(n-1);
    }

    public static void main(String[] args) {

        Sum s1=new Sum();

        System.out.println(s1.number(5));



    }




}
