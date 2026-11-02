package Multi_dimensional_basic_programs;

public class Student {

    public static void main(String[] args) {

        int [][] marks=new int[3][3];

        marks[0][0]=56;
        marks[0][1]=78;
        marks[0][2]=89;

        marks[1][0]=56;
        marks[1][1]=78;
        marks[1][2]=89;

        marks[2][0]=78;
        marks[2][1]=49;
        marks[2][2]=60;



        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks.length;j++)
            {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }




   }







}
