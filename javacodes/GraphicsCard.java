class GraphicsCard{
	String brand;
	int RAM;
	double price;
	
	GraphicsCard(){
		System.out.println("Invoking no-arguments from GraphicsCard");
		System.out.println("GraphicsCard brand :"+this.brand);
		System.out.println("GraphicsCard size :"+this.RAM);
		System.out.println("GraphicsCard price :"+this.price);
		this.brand="Colorful"; 
		this.RAM=2;
		this.price=9000;

	}
	GraphicsCard(String brand,int RAM,double price){
		System.out.println("Invoking arguments from GraphicsCard");
		this.brand=brand; 
		this.RAM=RAM;
		this.price=price;

		
	}
}