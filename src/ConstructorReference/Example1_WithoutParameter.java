package ConstructorReference;

interface I1
{
	public sample get();
}


class sample
{
	sample()
	{
		System.out.println("sample class constructor execution");
	}
}


public class Example1_WithoutParameter 
{
	public static void main(String[] args)
	{
		I1 obj=sample::new;
		sample i = obj.get();
		
		//here Interface get() refer sample class constructor
	}
}
