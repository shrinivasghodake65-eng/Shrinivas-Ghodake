package Staticprograms;

public class Test {

    static  void print() {
        System.out.println("hello");
    }

}

class Message extends Test{

    static void print ()
    {
        System.out.println("byyyy");
    }
}

class Demo{

    public static void main(String[] args) {

        Test t1=new Message();
        t1.print();


    }



}