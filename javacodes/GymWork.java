class GymWork{
	public static void main(String[] values){
		System.out.println("invoking main in GymKiller");
		Gym gym=new Gym();
		System.out.println(gym.name);
		System.out.println(gym.location);
		System.out.println(gym.price);
		System.out.println(gym.trainerName);
		System.out.println(gym.use);
		
		Gym gym1=new Gym();
		gym1.name="gymwork";
		gym1.location="rajajinagar";
		gym1.price=500;
	    gym1.trainerName="vinod";
		gym1.use="Build a body";
		System.out.println(gym1.name);
		System.out.println(gym1.location);
		System.out.println(gym1.price);
		System.out.println(gym1.trainerName);
		System.out.println(gym1.use);
		
	}
}