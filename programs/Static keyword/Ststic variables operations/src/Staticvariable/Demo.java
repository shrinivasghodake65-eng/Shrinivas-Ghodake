package Staticvariable;

public class Demo {

    String name;
    int password;
    int prise;
   static double balance;

   public static void main(String[] args) {

       Demo d1=new Demo();

       d1.name="om";
       d1.password=1234;
       d1.prise=25000;

       Demo.balance=10000.00;

       System.out.println(d1.name);
       System.out.println(d1.prise);
       System.out.println(d1.password);
       System.out.println(Demo.balance);


   }











}

