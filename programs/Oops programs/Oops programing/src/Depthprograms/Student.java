package Depthprograms;

public class Student {

    public static void main(String[] args) {

        Light l1=new Light(5,9);

        System.out.println(l1.a+","+l1.b);

        show(l1);

        System.out.println(l1.a+","+l1.b);
    }
    static void show(Light l)
    {
        l.a = l.a + 10;
        l.b= l.b + 10;
    }


}

class Light
{
    int a;
    int b;

    Light(int a,int b)
    {
        this.a=a;
        this.b=b;
    }






}