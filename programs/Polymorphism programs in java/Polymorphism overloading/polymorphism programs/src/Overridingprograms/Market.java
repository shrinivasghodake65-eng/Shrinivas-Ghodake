package Overridingprograms;

public class Market {

    void name(String marketname)
    {
        System.out.println("kond market");
    }

    void adress(String adress)
    {
        System.out.println("kond");
    }
}



class Murudmarket extends Market{

    @Override
    void name(String marketname)
    {
        System.out.println("murud market");
    }

    @Override
    void adress(String adress)
    {
        System.out.println("murud");
    }

    public static void main(String[] args) {
        Market m1=new Murudmarket();
        m1.name("murudeshwar");
        m1.adress("murud");



    }










}
