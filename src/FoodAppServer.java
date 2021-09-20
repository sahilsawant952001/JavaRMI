import java.rmi.*;
import java.rmi.registry.*;
public class FoodAppServer
{
    public static void main(String args[])
    {
        try
        {
            FoodApp obj = new FoodAppOrder();

            LocateRegistry.createRegistry(1900);

            Naming.rebind("rmi://localhost:1900"+ "/foodapp",obj);

            System.out.println("Server Started At : rmi://localhost:1900/foodapp");
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}