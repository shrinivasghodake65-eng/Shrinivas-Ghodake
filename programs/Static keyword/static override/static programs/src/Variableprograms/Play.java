package Variableprograms;

public class Play {

    int x=10;
}

class Cricket extends Play
{
    int x=20;
}

class Example{

    public static void main(String[] args) {

        Play p1=new Cricket();
        System.out.println(p1.x);

    }

}