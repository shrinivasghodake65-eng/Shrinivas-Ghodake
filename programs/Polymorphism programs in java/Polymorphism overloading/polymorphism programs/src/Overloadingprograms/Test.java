package Overloadingprograms;

public class Test {

    void login(String name)
    {
        System.out.println(name);
    }

    void login(String gmail ,int password)
    {
        if(gmail.contains("@"))
        {
            System.out.println(gmail);
        }
        else
        {
            System.out.println(password);
        }
    }

    void login()
    {
        System.out.println("successfull");
    }

    public static void main(String[] args) {

        Test t1=new Test();
        t1.login("shrinivas");
        t1.login("shree@gmail.com",1234);
        t1.login();






    }




}
