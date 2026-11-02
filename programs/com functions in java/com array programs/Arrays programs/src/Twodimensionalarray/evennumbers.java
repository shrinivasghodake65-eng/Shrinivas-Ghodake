package Twodimensionalarray;

public class evennumbers {

    public static void main(String[] args) {

        int[][] numbers={{10,20,30,45,},{32,69,79,64,}};

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(numbers[i][j]%2==0)
                {
                    System.out.println(numbers[i][j]);

                }
            }
        }








    }





}
