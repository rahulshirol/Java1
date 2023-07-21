class Trainee
{
	static void trainee(String name){
		System.out.println("Invoking trinee() in Trainee");
		System.out.println("Name of the Trainee:"+name);
	}
	static void trainee(String name, String branch){
		System.out.println("Invoking trainee() in Trainee");
		System.out.println("Name of the Trainee:"+name+ ",Branch:"+branch);
	}
	static void doCourse(String courseName){
		System.out.println("Invoking doCurse() in Trainee");
		System.out.println("Course Name:" +courseName);
	}
	static void doCourse(String courseName,int duration){
		System.out.println("Invoking doCurse() in Trainee");
		System.out.println("Course Name:" +courseName+ ",Duration in months:"+duration);
	}
	
	static void doTask(String task){
		System.out.println("Task Name:"+task);
	}
	static void doTask(String task, int hours){
		System.out.println("Task Name:"+task+ ",Total Hours:"+hours);
	}
	static void listenToClass(Boolean listenClass){
		System.out.println("trainee listen class"+ listenClass);
	}
	static void travel(String place){
		System.out.println("Place:"+place);
	}
	static void eat(){
		System.out.println("Invoking eat() in Trainee");
	}
	static void sit(){
		System.out.println("Invoking sit() in Trainee");
	}
	
}
class TraineeRunner{
	public static void main(String[] args){
		Trainee.trainee("Seemitha");
		Trainee.trainee("Seemitha","CSE");
		Trainee.doCourse("JAVA");
		Trainee.doCourse("JAVA",2);
		Trainee.doTask("mehods");
		Trainee.doTask("mehods",5);
		Trainee.listenToClass(true);
		Trainee.travel("Rajajinagar");
		Trainee.eat();
		Trainee.sit();
		
	}
}