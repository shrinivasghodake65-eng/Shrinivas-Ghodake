package Sceondoption;

public class Demo {

    int x=10;
    int getx()
    {
        return 10;
    }
}

class Test extends Demo{

    int x=20;

    int getx()
    {
        return 20;
    }
}


class Answer{

    public static void main(String[] args) {

        Demo d1=new Test();
        System.out.println(d1.getx());

    }
}