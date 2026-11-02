package Depthprograms;

public class Test {

    public static void main(String[] args) {

        Random r1=new Random(5,6);

        System.out.println(r1.x+","+r1.y);

        addten(r1);

        System.out.println(r1.x+","+r1.y);

    }

    static void addten(Random r)
    {
        r.x =r.x +10;
        r.y =r.y +10;
    }



}
class Random
{
    int x;
    int y;


     Random(int x,int y)
    {
        this.x=x;
        this.y=y;

    }












}