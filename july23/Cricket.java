class Cricket{
int ball;
String name;
double size;

Cricket(int killer)
{
this.ball=killer;
System.out.println(this.ball);
}
Cricket(int killer,String name)
{
	this(killer);
this.name=name;
System.out.println(this.name);
}
}