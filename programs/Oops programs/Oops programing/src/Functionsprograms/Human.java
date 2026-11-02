package Functionsprograms;

public class Human {

  static String name;
  static int id;
  static String gmail;
  int rollno;

  void student(String name,int id,String gmail,int rollno)
  {
      this.name=name;
      this.id=id;
      this.gmail=gmail;
      this.rollno=rollno;
  }
  void show()
  {
      System.out.println("name="+name);
      System.out.println("id="+id);
      System.out.println("gmail="+gmail);
      System.out.println("rollno="+rollno);

  }

 public static void main(String[] args) {

   Human h1=new Human();

   h1.student("shree",id=1,gmail="shree@gmail.com",101);

   h1.show();

     System.out.println("=========================================================");

   Human h2 =new Human();

   h2.student("aditya",2,"adi@gmailcom",102);

   h2.show();












 }







}
