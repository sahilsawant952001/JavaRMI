import java.rmi.*;
public interface FoodApp extends Remote
{
    public String placeOrder(String orderedItem,int count) throws RemoteException;
}