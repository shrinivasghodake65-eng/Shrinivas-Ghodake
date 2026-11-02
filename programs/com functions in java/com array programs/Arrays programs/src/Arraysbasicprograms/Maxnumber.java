package Arraysbasicprograms;

public class Maxnumber {

   public static void main(String[] args) {

     int[] number={10,20,30,48,67,90,99};
       int max=0;

     for(int i=0;i<number.length;i++)
     {
          if(number[i]>max)
          {
              max=number[i];
          }
     }

       System.out.println(max);


//       int[] number = {10, 20, 30, 48, 67, 90, 99};
//
//       int max = 0;
//
//       for (int i = 0; i < number.length; i++) {
//
//           if (number[i] > max) {
//               max = number[i];
//           }
//       }
//
//       System.out.println("Maximum number = " + max);






   }







}
