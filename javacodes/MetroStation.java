class MetroStation{
	public static void main(String[] values){
		System.out.println("invoking main in MetroKiller");
		Metro metro=new Metro();
		System.out.println(metro.name);
		System.out.println(metro.startLocation);
		System.out.println(metro.price);
		System.out.println(metro.destination);
		System.out.println(metro.usedFor);
		
		
		Metro metro1=new Metro();
		metro1.name="Kempegowda";
		metro1.startLocation="Majestic";
		metro1.price=25;
		metro1.destination="Rajajinagar";
		metro1.usedFor="Travel";
		System.out.println(metro1.name);
		System.out.println(metro1.startLocation);
		System.out.println(metro1.price);
		System.out.println(metro1.destination);
		System.out.println(metro1.usedFor);
		
	}
}