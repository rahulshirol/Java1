class TubeLightKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in TubeLightKiller");
		
		TubeLight tubeLight=new TubeLight();
		System.out.println("TubeLight brand :"+tubeLight.brand);
		System.out.println("TubeLight color :"+tubeLight.color);
		System.out.println("TubeLight price :"+tubeLight.price);
		
		
		TubeLight tubeLight1=new TubeLight("Crompton","White",180);
		System.out.println("TubeLight brand :"+tubeLight1.brand);
		System.out.println("TubeLight color :"+tubeLight1.color);
		System.out.println("TubeLight price :"+tubeLight1.price);
	}
}