package BasicConstructorprograms;

public class Village {

    String name;
    String gmail;
    int pincode;
    long number;

    Village(String name,String gmail,int pincode,long number)
    {
        this.name=name;
        this.gmail=gmail;
        this.pincode=pincode;
        this.number=number;

    }

    void print()
    {
        System.out.println(name);
        System.out.println(gmail);
        System.out.println(pincode);
        System.out.println(number);
    }

    public static void main(String[] args) {

        Village v1=new Village("kond","kond@gamail.com",1234,12345678L);
        v1.print();
    }














}
