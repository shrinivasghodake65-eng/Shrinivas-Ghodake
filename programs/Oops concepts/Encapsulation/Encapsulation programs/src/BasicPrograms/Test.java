package BasicPrograms;

public class Test {

   private String gmail;
   private String username;

    public void print(String gmail)
    {
        if(gmail.contains("@"))
        {
            System.out.println("Gmail="+gmail);
        }
    }

    public void show(String username)
    {
        if(username.length()<=9)
        {
            System.out.println("username="+username);
        }
    }


    public void Login(long number)
    {
        if(number>0)
        {
            if(number>=1000000000L)
            {
                System.out.println("number="+number);
            }
        }
    }


    public static void main(String[] args) {

        Test t1=new Test();
        t1.print("shri@gmail.com");

        t1.show("shrinivas");

        t1.Login(8600583600L);


    }



}
