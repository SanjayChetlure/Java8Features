package ConstructorReference;

interface I2
{
	public sample2 get(String s);
}


class sample2
{
	sample2(String s)
	{
		System.out.println("sample class constructor execution with parameter:- "+s);
	}
}


public class Example2_WithParameter 
{
	public static void main(String[] args)
	{
		I2 obj=sample2::new;
		obj.get("sanjay");
		
		//here Interface get() refer sample class constructor
	}
}
