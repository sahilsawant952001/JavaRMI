import java.rmi.*;
import java.rmi.server.*;
import java.util.UUID;

public class FoodAppOrder extends UnicastRemoteObject implements FoodApp
{
    FoodAppOrder() throws RemoteException
    {
        super();
    }

    public String placeOrder(String orderedItem,int count) throws RemoteException
    {
        int cost = 0;
        UUID uuid=UUID.randomUUID();
        if(orderedItem.equals("crispy veg burger"))
        {
            cost = 35*count;
        }
        else if(orderedItem.equals("crispy chicken burger"))
        {
            cost = 65*count;
        }
        else if(orderedItem.equals("sezhwan burger"))
        {
            cost = 50*count;
        }
        String resp = "Order Status : Order Approved\nOrder ID : "+uuid+"\nYou have to pay : "+cost+" Rs.";
        return resp;
    }
}