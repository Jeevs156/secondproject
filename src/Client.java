interface InterfaceA
{
    public void disp();
}
interface InterfaceB
{
    public void disp();
}
public class Client implements InterfaceA,InterfaceB
{
    @Override
    public void disp() 
    {
        System.out.println("disp() method implementation");
    }
    public static void main(String args[])
    {
        Client c = new Client();
        c.disp();
    }
}
