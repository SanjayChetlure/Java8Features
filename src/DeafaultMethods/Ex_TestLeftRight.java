package DeafaultMethods;

interface Left
{
	default void m1()
	{
		System.out.println("Left Interface method m1");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("Right Interface method m1");
	}
}

public class Ex_TestLeftRight implements Left, Right
{	
	public void m1() 
	{
		//System.out.println("method m1 in IC");
		Left.super.m1();
		//Right.super.m1();
	}
	
	public static void main(String[] args) 
	{
		Ex_TestLeftRight t=new Ex_TestLeftRight();
		t.m1();		
	}
}
