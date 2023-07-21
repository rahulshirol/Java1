class JacketWear{
	public static void main(String[] values){
		System.out.println("invoking the jacketWear");
		Jacket jacket=new Jacket();
		System.out.println(jacket.brand);
		System.out.println(jacket.colour);
		System.out.println(jacket.warranty);
		System.out.println(jacket.price);
		System.out.println(jacket.size);
		
		
		Jacket jacket1=new Jacket();
		jacket1.brand="petter england";
		jacket1.colour="black";
		jacket1.warranty="one year";
		jacket1.price=3499;
		jacket1.size= 'M';
		System.out.println(jacket1.brand);
		System.out.println(jacket1.colour);
		System.out.println(jacket1.warranty);
		System.out.println(jacket1.price);
		System.out.println(jacket1.size);
		
	}
}