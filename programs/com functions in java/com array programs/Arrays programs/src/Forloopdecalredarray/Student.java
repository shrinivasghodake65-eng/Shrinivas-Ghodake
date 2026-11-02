package Forloopdecalredarray;

public class Student {

    public static void main(String[] args) {

      int []number=new int [3];

      int x=101;

      for(int i=0;i<3;i++)
      {
          number[i]=x;
          x++;
      }
      for(int i=0;i<3;i++)
      {
          System.out.println(number[i]);
      }

    }





}
