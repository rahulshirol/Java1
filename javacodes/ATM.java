class ATM{
	String type;
	String holderName;
	int pinNumber;
	
	ATM(){
		System.out.println("Invoking no-arguments from ATM");
		System.out.println("Atm type :"+this.type);
		System.out.println("Atm holderName :"+this.holderName);
		System.out.println("Atm pinNumber :"+this.pinNumber);
		this.type="Visa Card"; 
		this.holderName="yallu";
		this.pinNumber=1352;

	}
	ATM(String type, String holderName,int pinNumber){ //local variable or parameter
		System.out.println("Invoking arguments from ATMCard");
		this.type=type; //assign variable to instance variable
		this.holderName=holderName;
		this.pinNumber=pinNumber;

		
	}
}