package MethodReference;

@FunctionalInterface
interface I2
{
	void add(int x, int y);

}



public class Example2_withMethodReference_static
{
	public static void sum(int a, int b) 
	{
		System.out.println("Sum of 2 num:- "+(a+b));
	}
	
	
	public static void main(String[] args) 
	{
		
		I2 obj= Example2_withMethodReference_static::sum;          //classname::methodname
		obj.add(10, 20);
		
	}
}
