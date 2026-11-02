package Anonymousobject;

public class Market {

    String marketname;
    int shop;
    String adress;
    double marketprise;

    Market(String marketname,int shop,String adress,double marketprise)
    {
        this.marketname=marketname;
        this.shop=shop;
        this.adress=adress;
        this.marketprise=marketprise;
    }

    void print()
    {
        System.out.println(marketname);
        System.out.println(shop);
        System.out.println(adress);
        System.out.println(marketprise);
    }

    public static void main(String[] args) {

         new Market("Kond market",50,"shivaji maharaj chauk",50000.00).print();

















    }
















}
