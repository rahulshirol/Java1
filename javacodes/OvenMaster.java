class Oven
{
	static void baking(String ovenType,String bakingItem,int bakingTempInC,String bakingMode)
	{
		System.out.println("Invoking tasty() in Cake");
		if(ovenType!=null){
			System.out.println("Oven Type is valid:"+ovenType);
		}
		else{
			System.out.println("Oven Type is in-valid:"+ovenType);
			return;
		}
		if(bakingItem!=null){
			System.out.println("Baking Item is valid:"+bakingItem);
		}
		else{
			System.out.println("Baking Item is in-valid:"+bakingItem);
			return;
		}
		if(bakingTempInC>=150){
			System.out.println("Baking Temperature in Celcius is valid:"+bakingTempInC);
		}
		else{
			System.out.println("Baking Temperature in Celcius is in-valid:"+bakingTempInC);
			return;
		}
		
		if(bakingMode!=null){
			System.out.println("Baking mode is valid:"+bakingMode);
		}
		else{
			System.out.println("BAking mode is in-valid:"+bakingMode);
			return;
		}
	}
}
class OvenMaster{
	public static void main (String[] args){
		System.out.println("Running main in OvenMaster");
		String ovenType="Oven";
		String bakingItem="cake";
		int bakingTempInC=100;
		String bakingMode="Convection";
		String type="Direct-Fired oven";
		int bakingTemp=120;
		Oven.baking(ovenType,bakingItem,bakingTempInC,bakingMode);
		Oven.baking(type,bakingItem,bakingTemp,bakingMode);
	
	}
}