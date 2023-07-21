class Soda{
	static void drink(String name,int calories,double price){
		System.out.println("Invoking drink() in Soda");
		if(name!=null)
		{
			System.out.println("Name is valid:"+name);
		}
		else
		{
			System.err.println("Name is invalid:"+name);
			return;
		}
		if(calories>=100)
		{
		     System.out.println("Calories is valid:"+calories);
		}
		else
		{
			System.err.println("Calories is invalid:"+calories);
			return;
		}
		if(price>=30)
		{
			System.out.println("Price is valid:"+price);
		}
		else
		{
			System.out.println("Price is invalid:"+price);
			return;
		}
	}
}
class SodaGlass{
	public static void main(String[] values){
		System.out.println("Invoking main in SodaKiller");
		String nameofsoda="Coca Cola";
		int calorie=130;
		double price=90;
		Soda.drink(nameofsoda,calorie,price);
	}
}