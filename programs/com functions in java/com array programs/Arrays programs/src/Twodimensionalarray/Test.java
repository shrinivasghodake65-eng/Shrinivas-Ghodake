package Twodimensionalarray;

public class Test {

    public static void main(String[] args) {

        int [][] numbers={{ 10,20,30,},{40,50,60}};

        int total=0;

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                total=total+numbers[i][j];
            }
        }

        System.out.println(total);


    }





}
