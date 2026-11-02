package Multilevelinheritance;

public class Current {


    void show() {
        System.out.println("current");
    }

}


class Bulb extends Current{

    void display()
    {
        System.out.println("bulbs");
    }

}

class Light extends Bulb{

   void test()
   {
       System.out.println("Lights");
   }

   public static void main(String[] args) {

       Light l1 =new Light();
       l1.test();
       l1.display();
       l1.show();



   }



}