package Staticvariable;

public class Test3 {
     String name;
     int age;

    static String village;

    public static void main(String[] args) {

       Test3 t3=new Test3();
       t3.name="shrinivas";
       t3.age=24;

       t3.village="kond";

        System.out.println(t3.name);
        System.out.println(t3.age);

        System.out.println(t3.village);


    }


}
