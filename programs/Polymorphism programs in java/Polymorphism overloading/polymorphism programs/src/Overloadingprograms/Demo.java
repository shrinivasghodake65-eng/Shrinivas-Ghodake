package Overloadingprograms;

public class Demo {

   void show(String username)
   {
       System.out.println(username);
   }

   void show(long mono,int password)
   {
       System.out.println(mono+","+password);
   }

   void show()
   {
       System.out.println("welcome");
   }

   public static void main(String[] args) {

Demo d1=new Demo();
d1.show("shrinivas");
d1.show(8600583600L,1392);
d1.show();



   }









}
