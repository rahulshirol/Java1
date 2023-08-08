//method overload
public class Sum {
 
    public int sum(int x, int y) { 
	return (x + y); 
	}
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    public double sum(double x, double y)
    {
        return (x + y);
    }
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}
public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int sum1 = calculator.add(5, 10); 
    System.out.println("Sum of 5 and 10 is: " + sum1);

    int sum2 = calculator.add(2, 4, 6); 
    System.out.println("Sum of 2, 4, and 6 is: " + sum2); 
}
