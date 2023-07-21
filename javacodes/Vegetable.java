class Vegetable
{
	public static void main(String[] prices)
	{
		System.out.println("running in the main method");
		String tomato="50";
		String carret="60";
		String onien="60";
		String chelly="40";
		String beetroot="60";
		String[] vegetableprice={tomato,carret,onien,chelly,beetroot,"70","60"};
		for(int price=0;price<vegetableprice.length;price++)
		{
			System.out.println("elements at index :"+price+"is:"+vegetableprice[price]);
		}
		System.out.println("element at index 3 before change:"+vegetableprice[3]);
		vegetableprice[3]="68";
		System.out.println("elements at index 3 after change:"+vegetableprice[3]);
		System.out.println("elements at index 6 before change:"+vegetableprice[6]);
		vegetableprice[6]="90";
		System.out.println("elements at index 6 after change:"+vegetableprice[6]);
		for(int veg=vegetableprice.length-1;veg>=0;veg--)
		{
			System.out.println("elemente at intex :"+veg+"is:"+vegetableprice[veg]);
		}
		
	     	
	}
}