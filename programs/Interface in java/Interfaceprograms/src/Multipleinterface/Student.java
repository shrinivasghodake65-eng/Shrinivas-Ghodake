package Multipleinterface;

public interface Student {

    void username(String username);

    void login(int number);

    void number(long mono);

    void gmail(String gmail);

}

class Schoolstudent implements Student{

    @Override
    public void username(String username) {
        System.out.println(username);

    }

    @Override
    public void login(int number) {
        System.out.println(number);


    }

    @Override
    public void number(long mono) {
        System.out.println(mono);

    }

    @Override
    public void gmail(String gmail) {
        System.out.println(gmail);

    }
    public static void main(String[] args) {


        Student s1=new Schoolstudent();
        s1.username("shrinivas");
        s1.login(1234);
        s1.gmail("shree@gmail.com");
        s1.number(8600583600L);

    }



}