package Staticblock;

public class Bank {

     String bankname;
       int loginid;
    static String gmail;
       int pincode;
   static double balance;

    Bank(String bankname,int loginid,int pincode)
    {
        this.bankname=bankname;
        this.loginid=loginid;
        this.pincode=pincode;
    }

    static
    {
        Bank.gmail="sbi@gmail.com";
        Bank.balance=12000.00;
    }

    public static void main(String[] args) {

        Bank b1 =new Bank("Sbi Murud",1,1392);

        System.out.println(b1.bankname+","+b1.loginid+","+","+b1.pincode+","+b1.gmail+","+b1.balance);



    }


}
