package Interfaceupcasting;

public class Privatebank implements Bank,Sbi{
    @Override
    public void login() {
        System.out.println("login success");

    }

    @Override
    public void register() {
        System.out.println("login register");

    }

    @Override
    public void username(String username) {

        System.out.println("username="+username);

    }

    @Override
    public void number() {
        System.out.println("login number");

    }

    public static void main(String[] args) {

        Privatebank p1=new Privatebank();
        p1.login();
        p1.number();
        p1.register();
        p1.username("shrinivas");


    }





}
