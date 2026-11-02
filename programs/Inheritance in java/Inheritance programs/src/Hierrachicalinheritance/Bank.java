package Hierrachicalinheritance;

public class Bank {

    void show()
    {
        System.out.println("bank");
    }
}


class Privatebank extends Bank{

    void display()
    {
        System.out.println("private bank");
    }

  public static void main(String[] args) {

        Privatebank p1=new Privatebank();
        p1.show();
        p1.display();
    }
}


class Governmentbank extends Bank{

    void login()
    {
        System.out.println("Government bank");
    }

    public static void main(String[] args) {

        Governmentbank g1=new Governmentbank();
        g1.show();
        g1.login();




    }




}