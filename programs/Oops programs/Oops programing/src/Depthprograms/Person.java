package Depthprograms;

public class Person {


    public static void main(String[] args) {

        Son s1=new Son(5,6);

        System.out.println(s1.i + "," +  s1.j);

        print(s1);

        System.out.println(s1.i + "," +  s1.j);

    }

    static void print(Son s)
    {
        s.i = s.i + 20 ;
        s.j = s.j  +20 ;
    }



}


class Son
{
    int i;
    int j;

    Son(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}