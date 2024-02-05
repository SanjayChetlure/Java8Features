package MethodReference;

@FunctionalInterface
interface I4
{
	void squareOfNum(int x);

}


public class Example4_withMethodReference_Nonstatic
{
	public void test(int y) 
	{
		System.out.println("square of num is "+y+": "+ y*y);
	}
	
	public static void main(String[] args) 
	{
		
		I4 obj= new Example4_withMethodReference_Nonstatic() :: test;
		obj.squareOfNum(4);
			
	}
}
