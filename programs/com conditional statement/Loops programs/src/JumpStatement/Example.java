package JumpStatement;

public class Example {

//    public static void main(String[] args) {
//
//        for(int i=0;i<=10;i++)
//        {
//            System.out.println(i);
//
//            if(i>5)
//            {
//                break;
//            }
//
//        }

public static void main(String[] args) {
    int p = 9;

    for (int i = 2; i <= 7; i++) {
        if (p % i == 0) {
            System.out.println("the number is not prime");
            break;
        }

        if (i == p) {
            System.out.println("the number is prime");
        }


    }


}
}
