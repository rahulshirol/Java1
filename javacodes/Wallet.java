class Wallet{
	String brand;
	String material;
	double price;
	
	Wallet(){
		System.out.println("Invoking no-arguments from Wallet");
		System.out.println("Wallet brand  :"+this.brand);
		System.out.println("Wallet voltage:"+this.material);
		System.out.println("Wallet price  :"+this.price);
		this.brand="Spiffy"; 
		this.materialType="Leather";
		this.price=249;
	}
	    Wallet(String brand,String materialType,double price){
		System.out.println("Invoking arguments from Wallet");
		this.brand=brand; 
		this.materialType=material;
		this.price=price;
	}
}