class Kulfi{
	
	static void tasty(String brand,float qunatityInGrams,int price,String type){
		System.out.println("Invoking tasty() in Kulfi");
		if(brand!=null){
			System.out.println("Kulfi brand  is valid:"+brand);
		}
		else{
			System.out.println("Kulfi brand  is in-valid:"+brand);
			return;
		}
		if(qunatityInGrams>=10){
			System.out.println("qunatity in grams is valid:"+qunatityInGrams);
		}
		else{
			System.out.println("scale Of Measurement is in-valid:"+qunatityInGrams);
			return;
		}
		if(price>=30){
			System.out.println("Price is valid:"+price);
		}
		else{
			System.out.println("Price is in-valid:"+price);
			return;
		}
		
		if(type!=null){
			System.out.println("Type Of Kulfi is valid:"+type);
		}
		else{
			System.out.println("Type of Kulfi is in-valid:"+type);
			return;
		}
	}
}
class SweetKulfi{
	public static void main (String[] args){
		System.out.println("Running main in KulfiRunner");
		
		
		String brand="Amul";
		float qunatityInGrams=50.6f;
		int price=45;
		String type="Chocolate";
		
		
		String brandKulfi=null;
		int cost=10;
		
		Kulfi.tasty(brand,qunatityInGrams,price,type);

		Kulfi.tasty(brandKulfi,qunatityInGrams,cost,type);	
		
	}
}