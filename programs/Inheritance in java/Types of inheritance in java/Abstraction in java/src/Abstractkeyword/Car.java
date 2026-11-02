package Abstractkeyword;

public abstract class Car {

    void start()
    {

    }
    abstract void accelerate();

    abstract void brake();

}


 class Electriccar extends Car{

    @Override
    void start()
    {
        System.out.println("electriccar is start");
    }

    @Override
    void accelerate()
    {
        System.out.println("electric car is accelerate");
    }

    @Override
    void brake()
    {
        System.out.println("electriccar is stop");
    }
}


class Fuelcar extends Car{

    @Override
    void start()
    {
        System.out.println("fuel car started");
    }


    @Override
    void accelerate() {
        System.out.println("fuel car accelerate");

    }

    @Override
    void brake() {
        System.out.println("fuel car is stop");

    }
}