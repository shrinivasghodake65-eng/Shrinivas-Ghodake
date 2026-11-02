package Lableforloop;

public class Teacher {

  public static void main(String[] args) {

 outer: for(int i=1;i<=10;i++)
  {
    inner:  for(int j=1;j<=i;j++)
      {
          System.out.print("*");
          if(j>=5)
          {
              break outer;
          }
      }
      System.out.println();
  }
  }
}
