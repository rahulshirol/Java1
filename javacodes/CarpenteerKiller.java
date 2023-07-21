class Carpenteer{
	static void cutWood()
	{
	 System.out.println("Invoking cutWood() in Carpenter");	
	}
	static void cutWood(String length, int type)	
	{
		System.out.println("Length of the wood:"+length+", "+type);
	}
	static void cutWood(int length,String type)
	{
		System.out.println("Length of the wood:"+length);
		System.out.println("Type of the wood:"+type);
	}
	static void drywall()
	{
		System.out.println("Invoking drywall() in Carpenter");
	}
	static void drywall(int height)
	{
		System.out.println("Height of the Wall:"+height);
	}
	static void measure(String material)
	{
		System.out.println("Type of material used:"+material);
	}
	static void measure(String material, String shape)
	{
		System.out.println("Type of material used:"+material);
		System.out.println("Type of Shape:"+shape);
		
	}
	static void staircase()
	{
		System.out.println("Invoking staircase() in Carpenter");
	}
	static void staircase(int number)
	{
		System.out.println("Number of step:"+number);
	}
	static void rowmaterials(String materialName)
	{
		System.out.println("Material Name:"+materialName);
	}
	static void rowmaterials(String materialName,double amount)
	{
		System.out.println("Material Name:"+materialName);
		System.out.println("Amount :"+amount);
	}
	
}
class CarpenteerKiller{
	public static void main(String[] values){
		
	Carpenteer.cutWood();
	Carpenteer.cutWood("name", 23);
	Carpenteer.cutWood(24,"Rosewood");
	Carpenteer.drywall(45);
	Carpenteer.drywall();
	Carpenteer.measure("Fiber Glass");
	Carpenteer.measure("Fiber Glass","Full Springline");
	Carpenteer.staircase();
	Carpenteer.staircase(15);
	Carpenteer.rowmaterials("Pine");
	Carpenteer.rowmaterials("Pine",250);
	
	
	
		
	}
}