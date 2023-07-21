class GraphicsKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in GraphicsKiller");
		
		GraphicsCard graphicsCard=new GraphicsCard();
		System.out.println("GraphicsCard brand :"+graphicsCard.brand);
		System.out.println("GraphicsCard RAM :"+graphicsCard.RAM);
		System.out.println("GraphicsCard price:"+graphicsCard.price);
		
		
		GraphicsCard graphicsCard1=new GraphicsCard("ASUS",8,15000);
		System.out.println("GraphicsCard brand :"+graphicsCard1.brand);
		System.out.println("GraphicsCard RAM :"+graphicsCard1.RAM);
		System.out.println("GraphicsCard price:"+graphicsCard1.price);
		
	}
}