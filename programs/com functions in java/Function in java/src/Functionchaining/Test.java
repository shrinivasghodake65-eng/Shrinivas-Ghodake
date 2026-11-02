package Functionchaining;

public class Test {

    static void Login(String gmail)
    {
        Login2(101);
        System.out.println("gmail="+gmail);
    }

    static void Login2(int id)
    {
        Login3(8600583600L);
        System.out.println("id="+id);
    }

    static void Login3(long number)
    {
        System.out.println("number="+number);
    }

  public static void main(String[] args) {

      Login("shree@gmail.com");









  }













}
