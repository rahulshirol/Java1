class Baker{
	static void cooking(String foodItem,int noOfPeople ,String workingFor,int exp,int duration,String assistance){
		System.out.println("Invoking cooking() in Baker");
		if(foodItem!=null){
			System.out.println("Food Item is valid:"+foodItem);
		}
		else{
			System.out.println("Food Item is in-valid:"+foodItem);
			return;
		}
		if(noOfPeople>0){
			System.out.println("Number Of pepole working with baker is valid:"+noOfPeople);
		}
		else{
			System.out.println("Number Of pepole working with baker is in-valid:"+noOfPeople);
			return;
		}
		if(workingFor!=null){
			System.out.println("workingFor() is valid:"+workingFor);
		}
		else{
			System.out.println("workingFor() is in-valid:"+workingFor);
			return;
		}
		if(exp>=20){
			System.out.println("Experience is valid:"+exp);
		}
		else{
			System.out.println("Experience is in-valid:"+exp);
			return;
		}
		if(duration>=1){
			System.out.println("Duration is valid:"+duration);
		}
		else{
			System.out.println("Duartion is in-valid:"+duration);
			return;
		}
		if(assistance!=null){
			System.out.println("Asssistance is valid:"+assistance);
		}
		else{
			System.out.println("Assistnce is in-valid:"+assistance);
			return;
		}
	}
}
class BestBaker{
	public static void main (String[] args){
		System.out.println("Running main in BakerKiller`");
		
		
		String foodItem="chicken roll";
		int noOfPeople=5;
		String workingFor="";
		int exp=2;
		int duration=5;
		String assistance="yes";
		
		String item="Ice Cake";
		int hours=7;
		
		Baker.cooking(foodItem,noOfPeople,workingFor,exp,duration,assistance);
		System.out.println("");
		Baker.cooking(item,noOfPeople,workingFor,exp,hours,assistance);
		
	}
}