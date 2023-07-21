class PowerBankFeatures
{
	public static void main(String[] values)
	{
		System.out.println("invoking main in PowerBankFeatures");
		PowerBank power=new PowerBank();
		System.out.println(power.brand);
		System.out.println(power.capacity);
		System.out.println(power.price);
		System.out.println(power.size);
		System.out.println(power.use);
		  
		  
		PowerBank power1=new PowerBank();
		power1.brand="realme";
		power1.capacity="10000mah";
		power1.price=2999;
	    power1.size="medium";
		power1.use="Reacharge";
		System.out.println( power1.brand);
		System.out.println(power1.capacity);
		System.out.println(power1.price);
		System.out.println(power1.size);
		System.out.println(power1.use);
		
	}
}