package Basicprograms;

public class Car {

    void start()
    {
        System.out.println("car starting");
    }

    void accelerate()
    {
        System.out.println("car accelerate");
    }

}

class Electriccar extends Car {

    public static void main(String[] args) {
        Electriccar e1 = new Electriccar();
        e1.start();
        e1.accelerate();

    }

}

    class Fuelcar extends Car{

        public static void main(String[] args) {

            Fuelcar f1=new Fuelcar();
            f1.start();
            f1.accelerate();



        }

    }







