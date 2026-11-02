package Overloadingprograms;

public class Student {

    void login(String username)
    {
        System.out.println("Username="+username);
    }

    void login(int code,long mono)
    {
        System.out.println("code="+code+","+"mono="+mono);
    }

    void login()
    {
        System.out.println("login to success");
    }


   public static void main(String[] args) {

        Student s1=new Student();
        s1.login(1234,8600583600L);
        s1.login("shrinivas");
        s1.login();



   }



}
