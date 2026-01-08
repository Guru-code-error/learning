public class fourpil{
    private String name;
    private int roll;
    public void setvalue(String n,int r)
    {
        this.name=n;
        this.roll=r;
    }
    public void display()
    {
        System.out.println("name is="+this.name);
        System.out.println("rollnumber is="+this.roll);
    }
    public String getname()
    {
        return this.name;
    }
     public int getroll()
    {
        return this.roll;
    }
    void display(String n,int m)
    {
        this.name=n;
        this.roll=m;
        System.out.println("name is="+this.name);
        System.out.println("rollnumber is="+this.roll);

    }
public static void main(String[] arg){
    fourpil ob=new fourpil();
    ob.setvalue("guru",20);
    ob.display();
    System.out.println(ob.getname());
    System.out.println(ob.getroll());
    ob.display("appu",20);
}
}
