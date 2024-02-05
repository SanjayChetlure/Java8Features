package DeafaultMethods;

interface I8 
{
	default void m1()
	{
		System.out.println("default method in interface");
	}
}



public class Ex_DefaultMC_afterOverride  implements I8
{	
	public void m1() 
	{
		System.out.println("overrided version of default method in IC");
	}
	
	public static void main(String[] args) 
	{
		Ex_DefaultMC_afterOverride i8=new Ex_DefaultMC_afterOverride();
		i8.m1();
	}
}
