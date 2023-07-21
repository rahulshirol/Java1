class Scanner{
	
	static void scan(String name,int price,String capture){
		System.out.println("Invoking scan() in Scanner");
		if(name!=null){
			System.out.println("Scanner name is valid:"+name);
		}
		else{
			System.err.println("Scanner name  is in-valid:"+name);
			return;
		}
		if(price>=10){
			System.out.println("price is valid:"+price);
		}
		else{
			System.err.println("price is in-valid:"+price);
			return;
		}
		if(capture!=null){
			System.out.println("Capture is valid:"+capture);
		}
		else{
			System.err.println("Capture is in-valid:"+capture);
			return;
		}
	}
}
class ScannerKiller{
	public static void main(String[] values){
		System.out.println("invoking main in ScannerKiller");
		String name="Paytm";
		int price=50;
		String capture="image";
		Scanner.scan(name,price,capture);
	}
}