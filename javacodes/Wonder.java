class Wonder
{
	public static void main(String[] args)
	{
		System.out.println("running in the main method");
		String rammandir="Ram mandir";
		String anjanadri="Anjanadri";
		String kedarnath="Kedarnath";
		String mysore="Mysore";
		String dharmasthala="Dharmasthala";
		String[] wonders={rammandir,anjanadri,kedarnath,mysore,dharmasthala};
		for(int words=0;words<wonders.length;words++)
		{
			System.out.println("elements at index :"+words+"is:"+wonders[words]);
		}
		for (int wonder=wonders.length-1;wonder>=0;wonder--)
		{
			System.out.println("elements at index:"+wonder+"is:"+wonders[wonder]);
		}
	}
}