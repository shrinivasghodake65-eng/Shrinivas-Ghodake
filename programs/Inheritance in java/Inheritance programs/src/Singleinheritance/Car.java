package Singleinheritance;

public class Car {

    void start()
    {
        System.out.println("Start up");
    }
}


class Vehicle extends Car{

    void show()
    {
        System.out.println(" car vehicle");
    }


    public static void main(String[] args) {

        Vehicle v1=new Vehicle();

        v1.start();
        v1.show();




    }


}