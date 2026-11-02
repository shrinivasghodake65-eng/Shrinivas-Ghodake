package Staticprograms;

public class Addition {

    static void add()
    {
        System.out.println("Addition");
    }
}

class Home extends Addition{

    static void add()
    {
        System.out.println("answer");
    }

}

class Login{

    public static void main(String[] args) {
        Addition a1=new Home();
        a1.add();



    }


}