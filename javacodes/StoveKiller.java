class Stove{
	static void fire(String type,int price,String brand){
		System.out.println("invoking fire in Stove");
		if(type!=null){
			System.out.println("type is valid:"+type);
		}
		else{
			System.err.println("type  is in-valid:"+type);
			return;
		}
		if(price>=1200){
			System.out.println("price is valid:"+price);
		}
		else{
			System.err.println("price is in-valid:"+price);
			return;
		}
		if(brand!=null){
			System.out.println("Brand is valid:"+brand);
		}
		else{
			System.err.println("Brand is in-valid:"+brand);
			return;
		}
	}
}
class StoveKiller{
	public static void main(String[] values){
		System.out.println("invoking main in ScannerKiller");
		String type="Gas Stove";
		int price=1500;
		String brand="Soorya";
		Scanner.scan(type,price,brand);
	}
}