class WalletKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in WalletKiller");
		
		Wallet wallet=new Wallet();
		System.out.println("Wallet brand :"+wallet.brand);
		System.out.println("Wallet Material Type :"+wallet.material);
		System.out.println("Wallet price :"+wallet.price);
		
		
		Wallet wallet1=new Wallet("Storite","Metal",599);
		System.out.println("Wallet brand :"+wallet1.brand);
		System.out.println("Wallet Material Type :"+wallet1.material);
		System.out.println("Wallet price :"+wallet1.price);
		
	}
}