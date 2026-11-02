package Overridingprograms;

public class Bank {

    void login(int number)
    {
        System.out.println("Login number");
    }

    void payment(long mono)
    {
        System.out.println("general payment");
    }


}


class Sbi extends Bank{

    @Override
    void login(int number)
    {
        System.out.println("Login mono");
    }

    @Override
    void payment(long mono) {
        System.out.println("upi payment");

    }

    public static void main(String[] args) {

        Sbi b1=new Sbi();
        b1.login(1234);
        b1.payment(8600583600L);

    }


}
