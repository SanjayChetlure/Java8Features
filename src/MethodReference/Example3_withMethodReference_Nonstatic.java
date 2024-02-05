package MethodReference;

@FunctionalInterface
interface I3
{
	void m1();

}

class Demo3 
{
	public void test() 
	{
		System.out.println("implementation of m1-from I3");
	}
}


public class Example3_withMethodReference_Nonstatic
{
	public static void main(String[] args) 
	{
//		Demo3 d3=new Demo3();
//		I3 obj=d3::test;
//		obj.m1();
		
		I3 obj=new Demo3()::test;
		obj.m1();
			
	}
}
