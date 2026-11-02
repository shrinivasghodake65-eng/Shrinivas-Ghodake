package Nestedforloopprograms;

public class Rectangle {

   public static void main(String[] args) {

       for(int i=1;i<=10;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");

               if(j>=5)
               {
                   break;
               }
           }
           System.out.println();
       }

   }





}
