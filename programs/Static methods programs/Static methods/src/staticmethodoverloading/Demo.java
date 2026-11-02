package staticmethodoverloading;

public class Demo {

    static void login()
    {
        System.out.println("static method overloading");
    }
    static void login(String name)
    {
        System.out.println(name);
    }

    static void ogin(int id, int number)
    {
        System.out.println(id+","+number);
    }


    public static void main(String[] args) {


        Demo.login();
        Demo.login("shrinivas");
        Demo.ogin(1,1234);

    }





}
