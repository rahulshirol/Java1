class Trainer
{
	static void teach()
	{
		System.out.println("Running teach() in Trainer class");
		System.out.println("\n");
	}
	static void teach(String subName)
	{
		System.out.println("Running teach() in Trainer class");
		System.out.println("Subject Name:"+subName);
		System.out.println("\n");
	}
	static void teach(String subName, int hours)
	{
		System.out.println("Running teach() in Trainer class");
		System.out.println("Subject Name:"+subName);
		System.out.println("Hours:"+hours);
		System.out.println("\n");
	}
	static void teach(String subName, int hours, String teachName)
	{
		System.out.println("Running teach() in Trainer class");
		System.out.println("Subject Name:"+subName);
		System.out.println("Hours:"+hours);
		System.out.println("Teacher Name:"+teachName);
		System.out.println("\n");
	}
	
	static void giveTask()
	{
		System.out.println("Running giveTask() in Trainer class");
		String subName="Java";
		System.out.println("Subject Name:"+subName);
		System.out.println("\n");
	}
	static void giveTask(int salary)
	{
		System.out.println("Running giveTask() in Trainer class");

		System.out.println("Salary:"+salary);
		System.out.println("\n");
	}
	static void giveTask(String location,int hours)
	{
		System.out.println("Running giveTask() in Trainer class");
		System.out.println("Location Name:"+location);
		System.out.println("Hours:"+hours);
		System.out.println("\n");
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