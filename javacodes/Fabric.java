class Fabric
{
	static int getPrice(String fabName)
	{
		System.out.println("Invoking getPrice() in Fabric");
		if(fabName!=null)
		{
			System.out.println("Fabric Name is Valid");
			if("cotton"==fabName)
			{
				return 400;
			}
			if("nylon"==fabName)
			{
				return 700;
			}
			if("woolen"==fabName)
			{
				return 300;
			}
			if("linen"==fabName)
			{
				return 900;
			}
			if("polyster"==fabName)
			{
				return 200;
			}
			if("silk"==fabName)
			{
				return 4000;
			}
		}
		else
		{
			System.err.println("Fabric is not valid");
		}
		return 100;
	}
}