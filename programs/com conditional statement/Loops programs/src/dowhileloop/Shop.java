package dowhileloop;
import java.util.Scanner;
public class Shop {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  main menu");
        System.out.println("1:play cricket");
        System.out.println("2:car drive");
        System.out.println("3:play ludo");
        System.out.println("Enter the number");
        int number=sc.nextInt();

        do
        {
            if(number==1)
            {
                System.out.println("play cricket");
            }
            else if(number==2)
            {
                System.out.println("car drive");
            }
            else if(number==3)
            {
                System.out.println("play ludo");
            }
            else
            {
                System.out.println("invalid number");
            }
            break;
        }
        while(number!=0);








    }




}
