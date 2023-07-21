public class Contractor{
	
	static void contractor(String name)
	{
		System.out.println("Invoking contrator() in Contractor");
		System.out.println("Name of the contractor: " + name);
	}
	
	static void contractor(String name, float salary)
	{
		System.out.println("Name of the contractor: " + name);
		System.out.println("Salary: " + salary);
	}
	
	static void contractor(String name, int experience)
	{
		System.out.println("Name of the contractor: " + name);
		System.out.println("experience: " + experience);
	}
	static void location(String locationName)
	{
		System.out.println("invoking location in contractor");
		System.out.println("Location Name:"+locationName);
	}
	static void location(int distance)
	{
		System.out.println("invoking location in contractor");
		System.out.println("Distance:"+ distance);
	}
	static void workers(int numberOfWorkers)
	{
		System.out.println("invoking workers in contractor");
		System.out.println("Workers:"+numberOfWorkers);
	}


    static void contractorWork(String workName)
	{
		System.out.println("Construction name:"+workName);
	}
	
	static void contractorSupervise()
	{
		System.out.println("Contractor will guide the labours to complete the work");
	}
	
	static void payAmount(int salary)
	{
		System.out.println("Paying salary to workers: " + salary);
	}
	
	static void bid(int amount)
	{
		System.out.println("bid money to get contract"+amount);
	}
}

 class ContractorExecuter
{

	public static void main(String[] args)
	{
		System.out.println("Running main in ContractorExecuter");
		Contractor.contractor("Darshan");
		Contractor.contractor("Darshan",120000);
		Contractor.contractor("Darshan",12);
		Contractor.location("Bangalore");
		Contractor.location(1000);
		Contractor.workers(10);
		Contractor.contractorWork("Building Home");
		Contractor.contractorSupervise();
		Contractor.payAmount(10000);
		Contractor.bid(1000);
	}
}