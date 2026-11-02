package Basicprograms;

public class Test {

    String name;
    int id;
    double balance;
 static  String village;




public static void main(String[] args) {

    Test t1=new Test();
    t1.name="shrinivas";
    t1.id=1234;
    t1.balance=25000.00;
   // t1.village="jvm murud";

    System.out.println(t1.name);
    System.out.println(t1.id);
    System.out.println(t1.balance);
   // System.out.println(t1.village);

    Test.village="jvm murud";

    System.out.println(Test.village);




}




}
