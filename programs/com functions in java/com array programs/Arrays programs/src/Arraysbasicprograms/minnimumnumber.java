package Arraysbasicprograms;

public class minnimumnumber {

  public static void main(String[] args) {

      int[]number={11,34,56,78,34,45,98};

      int min=number[0];

      for(int i=1;i<number.length;i++)
      {
          if(number[i]<min)
          {
              min=number[i];
          }
      }

      System.out.println(min);











  }










}
