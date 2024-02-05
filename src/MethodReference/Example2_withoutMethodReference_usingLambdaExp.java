package MethodReference;

@FunctionalInterface
interface I22
{
	void add(int x, int y);

}



public class Example2_withoutMethodReference_usingLambdaExp
{
//	public static void sum(int a, int b) 
//	{
//		System.out.println("Sum of 2 num:- "+(a+b));
//	}
	
	
	public static void main(String[] args) 
	{
		
		I22 obj=(a,b)-> System.out.println("Sum of 2 num "+(a+b));
		obj.add(10, 20);
		
	}
}
