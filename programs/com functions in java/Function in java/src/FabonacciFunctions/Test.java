package FabonacciFunctions;

public class Test {

    int fabonc(int n)
    {
        if(n==0|n==1)
        {
            return 1;
        }

        int x= fabonc(n-1);

        int y=fabonc(n-2);

        return x + y;
    }
  public static void main(String[] args) {

              Test t1=new Test();
      System.out.println(t1.fabonc(5));












  }







}
