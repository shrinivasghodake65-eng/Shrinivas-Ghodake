package Interfaceupcasting;

public class Schoolstudent implements Student {
    @Override
    public void name() {
        System.out.println("name");

    }

    @Override
    public void number() {
        System.out.println("number");

    }

    @Override
    public void register() {

        System.out.println("register");

    }

  public static void main(String[] args) {

        Student s1=new Schoolstudent();
        s1.name();
        s1.number();
        s1.register();

  }




}
