package Arraysbasicprograms;

public class Sumoddnumber {

    public static void main(String[] args) {

        int[] arr={13,45,78,56,90,89,33,55};

        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                sum=sum+arr[i];
            }
        }

        System.out.println(sum);








    }














}
