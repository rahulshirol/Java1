class TrainKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in TrainKiller");
		
		String ref1=Train.getTrainByNo("11013");
		System.out.println("Ref1 is: "+ref1);
		
		String ref2=Train.getTrainByNo("11014");
		System.out.println("Ref2 is: "+ref2);
		
		String ref3=Train.getTrainByNo("12134");
		System.out.println("Ref3 is: "+ref3);
		
		String ref4=Train.getTrainByNo("22691");
		System.out.println("Ref4 is: "+ref4);
		
		
	}
}