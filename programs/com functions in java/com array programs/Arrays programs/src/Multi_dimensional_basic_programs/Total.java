package Multi_dimensional_basic_programs;

public class Total {

    public static void main(String[] args) {

        int numbers[][]={{10,20,30,},{40,50,60}};

        int total=0;

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                total+=numbers[i][j];
              //  System.out.println(total);

            }
          //  System.out.println(total);

        }

        System.out.println(total);








    }








}



