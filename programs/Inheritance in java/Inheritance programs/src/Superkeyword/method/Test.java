package Superkeyword.method;

public class Test {

    void display()
    {
        System.out.println("hello shree");
    }

}


class Demo extends Test{

    void show()
    {
        super.display();
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.show();


    }



}