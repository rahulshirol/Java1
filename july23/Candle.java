public class Candle{
	static String ItemUsedInCandle;
	static String wickPosition;
	char candleSize;
	double price;
	
	public void candleInstanceVarMethod(){
		System.out.println("candleSize: " + candleSize);
		System.out.println("price: " + price);
	}
	
	static void candleStaticVarMethod(){
		System.out.println("ItemUsedInCandle: " + ItemUsedInCandle);
		System.out.println("wickPosition: " + wickPosition);
	}
	
	Candle(char candleSize, double price){
		this.candleSize = candleSize;
		this.price = price;
	}
	
	static{
		ItemUsedInCandle = "Candle Wax";
		wickPosition = "Center";
	}
}