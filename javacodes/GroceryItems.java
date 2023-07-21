class GroceryItems
{
	public static void main(String[] items)
	{
		System.out.println("running in main method");
		String rice="Rice";
		String milk="Milk";
		String sugar="Sugar";
		String wheat="Wheat";
		String javar="Javar";
		String[] groceryItems={rice,milk,sugar,wheat,javar,"oil","spice"};
		for (int items=0;items<groceryitems.length;items++)
		{
			System.out.println("elements at index:"+items+"is:"+Groceryitems[items]);
		}
		 System.out.println("elements at index 5 befor change :"+Groceryitems[5]);
		 SroceryItems[5]="nuts";
		 System.out.println("elements at index 5 befor change :"+Groceryitems[5]);
		 System.out.println("elements at index 3 befor change :"+Groceryitems[3]);
		 SroceryItems[3]="biskects";
		 System.out.println("elements at index 3 befor change :"+Groceryitems[3]);
		 for (int kumar=SroceryItems.length-1;kumar>=0;kumar--)
		 {
			 System.out.println("elements at index:"+kumar+"is:"+ Groceryitems[kumar]);
		 }
	}
}