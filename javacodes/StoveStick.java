class StoveStick{
public static void main(String[] args)
{
System.out.println("Invoking main soda");

int burners=39;

double price=900;
String fuelType="petrol";
Stove.receiver(burners,price,fuelType);
}
}

class Stove {
    static void receiver( int burners, double price, String fuelType) {
   
        System.out.println("Number of Burners: " + burners);
        System.out.println("Price: " + price);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Soda {

    static void displaySodaDetails( double volume, double price, String flavor) {
       
        System.out.println("Volume: " + volume);
        System.out.println("Price: " + price);
        System.out.println("Flavor: " + flavor);
       
       
    }
}

class SodaPickle{
public static void main(String[] args)
{
System.out.println("Invoking main soda");

double volume=39000;

double price=39;
String flavour="lemon";
Soda.displaySodaDetails(volume,price,flavour);
}