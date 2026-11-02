package Functionsprograms;

public class Bank {

    String name;
    int id;
    String gmail;
    int pincode;

    void bank(String name,int id,String gamail,int pincode)
    {
        this.name=name;
        this.id=id;
        this.gmail=gmail;
        this.pincode=pincode;
    }

    void show()
    {
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("gmail="+gmail);
        System.out.println("pincode="+pincode);
    }

    public static void main(String[] args) {

        Bank b1=new Bank();

        b1.bank("sbibank",1,"sbi@gmail.com",1234);

        b1.show();

    }



}
