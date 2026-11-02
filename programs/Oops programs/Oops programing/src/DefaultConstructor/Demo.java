package DefaultConstructor;

public class Demo {
     String name;
     int number;
     double balance;
     int password;

     Demo()
     {
         //default constructor used only their get the default values;
     }

    void test()
    {
        System.out.println(name);
        System.out.println(number);
        System.out.println(balance);
        System.out.println(password);
    }

    public static void main(String[] args) {

        Demo d1=new Demo();
        d1.test();




    }






}
