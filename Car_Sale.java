import java.util.*;
public class Car_Sale
{
    Scanner sc = new Scanner(System.in);
    String Model, Color, EngineType, FuelType;
    int Price;
    boolean Stock ;
    public Car_Sale(String car_Model, String car_Color, String car_EngineType, String car_FuelType, int car_Price)
    {
        this.Model = car_Model;
        this.Color = car_Color;
        this.EngineType = car_EngineType;
        this.FuelType = car_FuelType;
        this.Price = car_Price;
    }
    boolean Authorize(int payment)
    {
        if (payment>(Price/2))
        {
            System.out.println("***********Sell of the car is approved***********");
            return true;
        }
        else
        {
            System.out.print("***********Sell of the car is not approved due to pending payment***********");
            return false;
        }
    }
    public Car_Sale(boolean Stock,String Model, String Color, String EngineType, String FuelType, int payment)
    {
        if(Stock)
        {
            System.out.println();
            System.out.println("Press '1': Stock is available \t\tPress '2' Stock is not availabe");
            int avail = sc.nextInt();
            switch(avail)
            {
                case 1:
                {
                        System.out.println();
                        System.out.println("Enter Customer Details :");
                        System.out.println("Enter the Car Owner Name :");
                        String name = sc.next();
                        System.out.println("Delivery Date :");
                        String date = sc.next();
                        System.out.println();
                        System.out.println("_______________Delivery Order________________");
                        System.out.println();
                        System.out.println("Customer Name \tModel \tColor \tEngine Type \tFue Type \tDelivery Date \tPayment Due");
                        System.out.println();
                        System.out.println(name+" \t\t"+Model+" \t"+Color+"\t"+EngineType+" \t\t"+FuelType+"\t\t"+date+ "\t"+payment);
                        break;
                }
                case 2:
                {
                        System.out.println();
                        System.out.println("Enter Production Details :");
                        System.out.println("Enter the Production Branch Name :");
                        String production_name = sc.next();
                        System.out.println("Enter the Showroom Address :");
                        String showroom_address = sc.next();
                        System.out.println("Date of Delivery :");
                        String Pdate = sc.next();
                        System.out.println();
                        System.out.println("_______________Production Order________________");
                        System.out.println();
                        System.out.println("Production Branch Name \tShowroom Address \tModel \tColor \tEngine Type \tFue Type \tDelivery Date \tPayment Due");
                        System.out.println();
                        System.out.println(production_name+" \t\t"+showroom_address+ "\t\t\t"+Model+" \t"+Color+"\t"+EngineType+" \t\t"+FuelType+"\t\t"+Pdate+"\t"+payment);
                        break;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("_______________CAR DETAILS________________");
        System.out.println("Enter the Car Model :");
        String Model = sc.next();
        System.out.println("Enter the Car Color :");
        String Color = sc.next();
        System.out.println("Enter the Car Engine Type :");
        String EngineType = sc.next();
        System.out.println("Enter the Car Fuel Type :");
        String FuelType = sc.next();
        System.out.println("Enter the Car Price :");
        int Price = sc.nextInt();
        Car_Sale saleorder = new Car_Sale(Model,Color,EngineType,FuelType,Price);
        System.out.println();
        System.out.println("Enter the payment made by the Client :");
        int payment = sc.nextInt();
        int due_payment = Price-payment;
        boolean authorize = saleorder.Authorize(payment);
        Car_Sale order = new Car_Sale(authorize,Model,Color,EngineType,FuelType,due_payment);
    }
}