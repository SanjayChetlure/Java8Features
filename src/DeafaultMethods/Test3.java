package DeafaultMethods;

public class Test3 implements I1
{
	@Override
	public void m1() 
	{
		System.out.println("m1 completed in Test3");
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 completed in Test3");
	}
	
	public void m3() 
	{
		System.out.println("Hi");
	}
}
