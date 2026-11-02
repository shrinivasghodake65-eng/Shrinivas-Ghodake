package Basicprograms;

public interface Car {

    void start();

    void accelerate();

    void brake();

}


class Electriccar implements Car{


    @Override
    public void start() {
        System.out.println("electric car started");
    }

    @Override
    public void accelerate() {
        System.out.println("elelctric car accelerated");

    }

    @Override
    public void brake() {

        System.out.println("electric car has stoped");

    }
}


class Fuelcar implements Car{


    @Override
    public void start() {
        System.out.println("fuel car started");
    }

    @Override
    public void accelerate() {
        System.out.println(" car accelerated");
    }

    @Override
    public void brake() {
        System.out.println("car has stoped");

    }
}


class Demo
{
    public static void main(String[] args) {
        Car car=new Electriccar();
        car.start();
        car.accelerate();
        car.brake();

        System.out.println("=========================================================");

        Car car1=new Fuelcar();
        car1.start();
        car1.accelerate();
        car1.brake();




    }
}