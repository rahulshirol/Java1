class DroneKiller{
	public static void main(String[] args){
		System.out.println("running main in DroneKiller");
		
		double ref=Drone.getDistanceByFlight("Parrot","Aerial Photography");
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight("IdeaForge","Baloon carrier");
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight(null,null);
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight("droneoperator","gernalisum");
		System.out.println("ref is:"+ref);
		
		System.out.println("===============================");
		
		double price=Drone.getPricePerEvent("Aerial Photography");
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent("Baloon carrier");
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent(null);
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent("gernalisum");
		System.out.println("price is:"+price);
		
		System.out.println("=================================");
		
		int discount=Drone.getDiscountByEvent("Aerial Photography","Santhosh");
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent("Baloon Carrier","rahul");
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent(null,null);
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent("gernalisum","rohit");
		System.out.println("discount is:"+discount);
	}
}