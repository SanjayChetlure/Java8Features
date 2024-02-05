package MethodReference;

@FunctionalInterface
interface I11
{
	void m1();

}


public class Example1_withoutMethodReference_usingLambdaExp
{
	public static void main(String[] args) 
	{
		
		I11 obj=()->System.out.println("running method m1 of FI I11");;           
		obj.m1();
		
	}
}
