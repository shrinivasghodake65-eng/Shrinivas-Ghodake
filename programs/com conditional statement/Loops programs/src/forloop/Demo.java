package forloop;

public class Demo {

    public static void main(String[] args) {

//        for(int i=1,j=2;i<=10;i++,j++)
//        {
//            System.out.println(i * j);
//        }

         for(int i=4;i<5;i++)
         {
             System.out.println("i"+i);             // 0 1 2 3 4 3
             for(int j=3;j<4;j++)
             {
                 System.out.println("j"+j);

                 for(int k=2;k<j;k++)
                 {
                     System.out.println("j"+j);
                 }
             }



         }






    }


}
