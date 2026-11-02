package Copyconstructor;

public class Market {
    String marketname;
    int shop;
    String adress;
    double marketprise;

    Market(String marketname, int shop, String adress, double marketprise) {
        this.marketname = marketname;
        this.shop = shop;
        this.adress = adress;
        this.marketprise = marketprise;
    }
     Market(Market M)
     {
         marketname=M.marketname;
         shop=M.shop;
         adress=M.adress;
         marketprise=M.marketprise;
     }



    void print() {
        System.out.println(marketname);
        System.out.println(shop);
        System.out.println(adress);
        System.out.println(marketprise);
    }

    public static void main(String[] args) {

      Market m1 =new Market("Kond market", 50, "shivaji maharaj chauk", 50000.00);
      m1.print();

        System.out.println("==================================================================================");

      Market m2 =new Market("Murud market", 50, "shivaji maharaj chauk", 10000.00);

      m2.print();

        System.out.println("=====================================================================================");

        Market m3 =new Market(m1);

        m3.print();
    }
}