package BasicPrograms;

public class Bankaccount {

    private double bankbalance;

    void deposit(int amount)
    {
        if(amount>0)
        {
            bankbalance+=amount;
            System.out.println(bankbalance);
        }

    }
    void cashwithdrwal(int amount)
    {
        if(amount<=bankbalance)
        {
            bankbalance-=amount;
            System.out.println(bankbalance);
        }

    }

    double getbalance()
    {
        return bankbalance;

    }

    public static void main(String[] args) {

        Bankaccount b1=new Bankaccount();
        b1.deposit(1000);

        b1.cashwithdrwal(200);

        System.out.println(b1.getbalance());


    }










}
