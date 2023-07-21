import java.util.Scanner;
class Login{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
int id=93536467;
String password="Rahul";
System.out.println("Enter the login credentials");
int st=sc.nextInt();

if(id==93536467 && password=="Rahul"){
	System.out.println("Login successfull");
}
else{
	System.out.println("Login unsuccessfull, enter valid login credentials");
	
}
}
}