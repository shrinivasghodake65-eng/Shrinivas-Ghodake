package Constructoroverloading;

public class Test {

   Test()
   {
       this(1);
       System.out.println("default constructor");

   }

   Test(int a)
   {
       this("shree" ,1234);
       System.out.println(" 1 parameter constructor ");
   }

   Test(String name,int password)
   {
       this("shree@gmail.com",8600583600L,413509);
       System.out.println("2 parameter constructor");
   }

    Test(String gmail,Long mono,int pincode)
    {
        System.out.println("3 parameter constructor");
    }


    public static void main(String[] args) {

       Test t1=new Test();








    }











}
