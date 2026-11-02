package Arraysbasicprograms;

public class Evennumber {

    public static void main(String[] args) {

        int [] arr={ 10,33,23,45,78,89};

        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }



}
