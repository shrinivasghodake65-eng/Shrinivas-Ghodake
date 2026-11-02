package Multi_dimensional_basic_programs;

public class maxnumbers {

    public static void main(String[] args) {

        int arr[][]={{10,20,30,},{50,60,70}};

        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }

            }

        }

        System.out.println(max);










    }










}
