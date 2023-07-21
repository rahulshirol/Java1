class PersonAge
{
	static int getAgeByName(String personName)
	{
		System.out.println("Invoking getAgeByName() in Person");
		if(personName!=null)
		{
			System.out.println("Person Name is Valid");
			if(personName=="rahul")
			{
				return 21;
			}
			if(personName=="Daru")
			{
				return 20;
			}
			if(personName=="Saikumar")
			{
				return 22;
			}
			if(personName=="Anju")
			{
				return 45;
			}
			if(personName=="Akshay")
			{
				return 25;
			}
			if(personName=="rohit")
			{
				return 10;
			}
			if(personName=="Sanj")
			{
				return 23;
			}
			if(personName=="Satya")
			{
				return 12;
			}
			if(personName=="Raju")
			{
				return 20;
			}
			if(personName=="Amulya")
			{
				return 30;
			}
			if(personName=="Harshish")
			{
				return 21;
			}
		}
		else
		{
			System.err.println("Name is not valid");
		}
		return 100;
	}
	
}