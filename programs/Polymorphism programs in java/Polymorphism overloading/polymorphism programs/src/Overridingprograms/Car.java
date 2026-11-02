package Overridingprograms;

public class Car {

    void start() {
        System.out.println("start car");
    }

    void accelerate() {
        System.out.println("car accelerate");
    }
}

    class Electriccar extends Car {

        @Override
        void start() {
            System.out.println("Electric car start");
        }

        @Override
        void accelerate() {
            System.out.println("electric accelerate");
        }

public static void main(String[] args) {
    Electriccar c1= new Electriccar();
    c1.start();
    c1.accelerate();

}




        }

















