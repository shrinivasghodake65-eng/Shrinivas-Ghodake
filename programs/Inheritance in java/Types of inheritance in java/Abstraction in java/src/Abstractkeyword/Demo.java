package Abstractkeyword;

public class Demo {

    public static void main(String[] args) {

        Electriccar e1=new Electriccar();
        e1.start();
        e1.accelerate();
        e1.brake();

        System.out.println("=====================================================================");

        Fuelcar f1=new Fuelcar();
        f1.start();
        f1.brake();
        f1.accelerate();




    }

}
