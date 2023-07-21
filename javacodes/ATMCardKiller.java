class ATMCardKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in ATMCardKiller");
		
		ATM atmCard=new ATM();
		System.out.println("ATM card type in main method:"+atmCard.type);
		System.out.println("ATM card holder name in main method:"+atmCard.holderName);
		System.out.println("ATM card pin number in main method"+atmCard.pinNumber);
		
		
		
		ATM atmCard1=new ATM("RuPay","Sinchana",7656);
		System.out.println("ATM card type in main method:"+atmCard1.type);
		System.out.println("ATM card holder name in main method:"+atmCard1.holderName);
		System.out.println("ATM card pin number in main method"+atmCard1.pinNumber);
		
	}
	}