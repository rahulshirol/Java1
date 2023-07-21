class GoldSmith{
	
	static void design(String designType,float qunatityInGrams,int price,String goldSmithName, int exp){
		System.out.println("Invoking design in GoldSmith");
		if(designType!=null){
			System.out.println("Kulfi brand  is valid:"+designType);
		}
		else{
			System.out.println("Kulfi brand  is in-valid:"+designType);
			return;
		}
		if(qunatityInGrams>=1){
			System.out.println("qunatity in grams is valid:"+qunatityInGrams);
		}
		else{
			System.out.println(" qunatity in gramsis in-valid:"+qunatityInGrams);
			return;
		}
		if(price>=4000){
			System.out.println("Price is valid:"+price);
		}
		else{
			System.out.println("Price is in-valid:"+price);
			return;
		}
		
		if(goldSmithName!=null){
			System.out.println("Name of the goldsmith is valid:"+goldSmithName);
		}
		else{
			System.out.println("Name of the goldsmith is in-valid:"+goldSmithName);
			return;
		}
		if(exp>0){
			System.out.println("Excperince is valid:"+exp);
		}
		else{
			System.out.println("Excperince is in-valid:"+exp);
			return;
		}
		
	}
}

class Gold{
	public static void main (String[] args){
		System.out.println("Running main in SodaRunner");

		String designType="Gold-plated";
		float qunatityInGrams=2;
		int price=9500;
		String goldSmithName="Rahul";
		int exp=2;
		String type="Solid Gold";
		int cost=11000;
		
		GoldSmith.design(designType,qunatityInGrams,price,goldSmithName,exp);
		GoldSmith.design(type,qunatityInGrams,cost,goldSmithName,exp);
		
		
		
		
		
	}
}