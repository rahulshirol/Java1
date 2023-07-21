class Trainer
{
	static void teach()
	{
		System.out.println("Running teach() in Trainer class");
	}
	static void teach(String subName)
	{
		System.out.println("Running teach() in Trainer class");
		System.out.println("Subject Name:"+subName);
	}
	static void teach(String subName, int hours)
	{
		System.out.println("Running teach() in Trainer class");
		System.out.println("Subject Name:"+subName);
		System.out.println("Hours:"+hours);
	}
	static void teach(String subName, int hours, String teachName)
	{
		System.out.println("Running teach() in Trainer class");
		System.out.println("Subject Name:"+subName);
		System.out.println("Hours:"+hours);
		System.out.println("Teacher Name:"+teachName);
	}
	
	static void giveTask()
	{
		System.out.println("Running giveTask() in Trainer class");
		String subName="Java";
		System.out.println("Subject Name:"+subName);
	}
	static void giveTask(int salary)
	{
		System.out.println("Running giveTask() in Trainer class");

		System.out.println("Salary:"+salary);
	}
	static void giveTask(String location,int hours)
	{
		System.out.println("Running giveTask() in Trainer class");
		System.out.println("Location Name:"+location);
		System.out.println("Hours:"+hours);
	}
	static void giveTask(String location,int hours,int noOfStudent)
	{
		System.out.println("Running giveTask() in Trainer class");
		System.out.println("Location Name:"+location);
		System.out.println("Hours:"+hours);
		System.out.println("No of Student:"+noOfStudent);
		System.out.println("\n");
	}
	static void takeTest()
	{
		System.out.println("Running takeTest() in Trainer class");
		takeTest(78);
		System.out.println("\n");
	}
	static void takeTest(int marks)
	{
		System.out.println("Running takeTest() in Trainer class");
		System.out.println("Marks:"+marks);

	}



}
class TrainerExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in TrainerExecuter");
		Trainer.teach();
		Trainer.teach("SQL");
		Trainer.teach("SQL",12);
		Trainer.teach("SQL",12,"Arch");
		Trainer.giveTask();
		Trainer.giveTask(12000);
		Trainer.giveTask("Bengaluru",190);
		Trainer.giveTask("Bengaluru",190,100);
		Trainer.takeTest();
		Trainer.takeTest(120);
	}
}