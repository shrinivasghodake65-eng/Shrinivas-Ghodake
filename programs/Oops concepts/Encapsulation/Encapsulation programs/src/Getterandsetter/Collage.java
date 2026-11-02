package Getterandsetter;

public class Collage {

    private String collagename;
    private int id;
    private String gmail;


    public String getcollagename()
    {
        return collagename;
    }

    public void setCollagename(String collagename)
    {
        this.collagename=collagename;
    }

    public int getid()
    {
        return id;
    }

    public void setid(int id)
    {
        this.id=id;
    }

    public String getgmail()
    {
        return gmail;

    }

    public void setgmail(String gmail)
    {
        this.gmail=gmail;
    }

   public static void main(String[] args) {

       Collage c1=new Collage();
       c1.setCollagename("collagename"+"Jvm murud");

       System.out.println("id="+c1.getcollagename());

       c1.setid(1234);
       System.out.println(c1.getid());

        c1.setgmail("Jvm@gmail.com");
       System.out.println("Gmail="+c1.getgmail());




   }







}
