class StadiumRcb{
	public static void main(String[] values)
	{
		System.out.println("inovking the stadium");
		Stadium stadium=new Stadium();
		System.out.println(stadium.name);
		System.out.println(stadium.game);
		System.out.println(stadium.capacity);
		System.out.println(stadium.owner);
		System.out.println(stadium.location);
		
		
		Stadium stadium1=new Stadium();
		stadium1.name="chinnaswamy";
		stadium1.game="cricket";
		stadium1.capacity=32000;
		stadium1.owner="gov of karnataka";
		stadium1.location="bengaluru";
		System.out.println(stadium1.name);
		System.out.println(stadium1.game);
		System.out.println(stadium1.capacity);
		System.out.println(stadium1.owner);
		System.out.println(stadium1.location);

		
	}
}