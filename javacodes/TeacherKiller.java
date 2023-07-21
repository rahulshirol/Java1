class TeacherKiller{
	public static void main(String[] values){
		System.out.println("invoking main in TeacherKiller");
		Teacher teacher=new Teacher();
		System.out.println(teacher.name);
		System.out.println(teacher.subject);
		System.out.println(teacher.age);
		System.out.println(teacher.experience);
		System.out.println(teacher.salary);
		
		
		
		Teacher teacher1=new Teacher();
		teacher1.name="prathap";
		teacher1.subject="dsd";
		teacher1.age=40;
	    teacher1.experience=15;
		teacher1.salary=35000;
		System.out.println( teacher1.name);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.age);
		System.out.println(teacher1.experience);
		System.out.println(teacher1.salary);
		
	}
}