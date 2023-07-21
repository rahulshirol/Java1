class GeneratorKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in GeneratorKiller");
		
		Generator generator=new Generator();
		System.out.println("Generator brand:"+generator.brand);
		System.out.println("Generator voltage:"+generator.voltage);
		System.out.println("Generator price:"+generator.price);
		
		
		Generator generator1=new Generator("Honda",180,65000);
		System.out.println("Generator brand :"+generator1.brand);
		System.out.println("Generator voltage :"+generator1.voltage);
		System.out.println("Generator price :"+generator1.price);
		
	}
}