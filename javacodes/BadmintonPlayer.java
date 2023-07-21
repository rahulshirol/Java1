class BadmintonPlayer{
	public static void main(String[] values)
	{
		System.out.println("invoking main in Badmintonplayer");
		Badminton b=new Badminton();
		System.out.println(b.type);
		System.out.println(b.benifit);
		System.out.println(b.noOfPlayers);
		System.out.println(b.hit);
		System.out.println(b.typeOfSport);
	
	
		Badminton b1=new Badminton();
		b1.type="Game";
		b1.benifit="Health";
		b1.noOfPlayers=2;
		b1.hit="Shuttlecock";
		b1.typeOfSport="Racquet sport";
		System.out.println(b1.hit);
		System.out.println(b1.benifit);
		System.out.println(b1.noOfPlayers);
		System.out.println(b1.type);
		System.out.println(b1.typeOfSport);
		
	}
}