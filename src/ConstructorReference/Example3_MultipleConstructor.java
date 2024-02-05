package ConstructorReference;

interface I3
{
	public sample get();
}


class sample3
{
	sample3()
	{
		System.out.println("No arg constrctor");
	}
	
	sample3(String s)
	{
		System.out.println("String arg constrctor:- "+s);
	}
}


public class Example3_MultipleConstructor 
{
	public static void main(String[] args)
	{
		I1 obj=sample::new;
		sample i = obj.get();
		
		//here Interface get() refer sample class constructor
	}
}
