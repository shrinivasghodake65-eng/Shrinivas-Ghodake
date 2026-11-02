package BasicConstructorprograms;

public class Student {

    String name;
    int id;
    String gmail;
    int pincode;

    Student(String name,int id,String gmail,int pincode)
    {
        this.name=name;
        this.id=id;
        this.gmail=gmail;
        this.pincode=pincode;
    }

    void print()
    {
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("gmail="+gmail);
        System.out.println("pincode="+pincode);
    }


    public static void main(String[] args) {

        Student s1=new Student("shrinivas",1,"shree@gmail.com",1234);

        s1.print();

    }






}
