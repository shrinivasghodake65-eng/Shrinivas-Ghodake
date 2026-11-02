package Scannerclass;
import java.util.Scanner;
public class Student {

    public static void main(String[] args) {


        float[] marks=new float[6];

       Scanner sc=new Scanner (System.in);
        System.out.println("Enter your marks");

        for(int i=0;i<marks.length;i++)
        {
            System.out.println("index of marks"+i);
             marks[i]=sc.nextInt();
        }

        for(int i=0;i<marks.length;i++)
        {
            System.out.println("element of marks"+marks[i]);
        }











    }




}
