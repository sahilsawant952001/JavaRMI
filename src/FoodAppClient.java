import java.rmi.*;
import java.util.Scanner;
public class FoodAppClient
{
    public static void main(String args[])
    {
        try
        {
            String response;
            System.out.println("----------------------------------------------------");
            System.out.println("Welcome To Online Food Ordering System!");
            System.out.println("----------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for 'crispy veg burger' Price : '35Rs.'");
            System.out.println("Enter 2 for 'crispy chicken burger' Price : '65Rs.'");
            System.out.println("Enter 3 for 'sezhwan burger' Price:'50Rs.'");
            System.out.println("----------------------------------------------------");
            System.out.print("Enter Your Option : ");
            int option = sc.nextInt();
            System.out.print("Enter Quantity : ");
            int quantity = sc.nextInt();
            System.out.println("----------------------------------------------------");
            String food = option==1?"crispy veg burger":option==2?"crispy chicken burger":"sezhwan burger";
            // lookup method to find reference of remote object
            FoodApp access = (FoodApp) Naming.lookup("rmi://localhost:1900"+ "/foodapp");

            response = access.placeOrder(food,quantity);
            System.out.println(response);
            System.out.println("----------------------------------------------------");
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}