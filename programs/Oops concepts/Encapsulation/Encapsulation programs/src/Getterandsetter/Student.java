package Getterandsetter;

public class Student {

    private String name;
    private int rollno;
    private int age;
    private String collagename;

    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }

    public int getRollno()
    {
        return rollno;
    }


    public void setrollno(int rollno)
    {
        this.rollno=rollno;
    }

    public int getage()
    {
        return age;
    }

    public void setage(int age)
    {
        this.age=age;
    }

    public String getcollagename()
    {
        return collagename;
    }
    public void setCollagename(String collagename)
    {
        this.collagename=collagename;
    }


    public static void main(String[] args) {

     Student s1=new Student();

     s1.setname("shrinivas");
        System.out.println(s1.getname());

        s1.setrollno(1);
        System.out.println(s1.getRollno());

        s1.setage(23);
        System.out.println(s1.getage());

        s1.setCollagename("jvm murud");
        System.out.println(s1.getcollagename());


    }

















}
