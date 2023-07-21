class TubeLight{
	String brand;
	String color;
	double price;
	
	TubeLight(){
		System.out.println("Invoking no-arguments from Tubelight");
		System.out.println("TubeLight brand :"+this.brand);
		System.out.println("TubeLight color :"+this.color);
		System.out.println("TubeLight price :"+this.price);
		this.brand="Philips"; 
		this.color="White";
		this.price=180;

	}
	TubeLight(String brand,String color,double price){
		System.out.println("Invoking arguments from TubeLight");
		this.brand=brand; 
		this.color=color;
		this.price=price;

		
	}
}