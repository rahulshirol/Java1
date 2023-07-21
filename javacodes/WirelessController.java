class WirelessController{
	public static void main(String[] values){
		System.out.println("invoking main in WirelessController");
		Controller c=new Controller();
		System.out.println(c.brand);
		System.out.println(c.use);
		System.out.println(c.price);
		System.out.println(c.maximumRange);
		System.out.println(c.otherName);
		
		
		
		Controller c1=new Controller();
		c1.brand="Cisco";
		c1.use="To connect one device to other device";
		c1.price=1500;
	   c1.maximumRange=7;
		c1.otherName="LAN";
		System.out.println(c1.brand);
		System.out.println(c1.use);
		System.out.println(c1.price);
		System.out.println(c1.otherName);
		System.out.println(c1.maximumRange);
		
	}
}