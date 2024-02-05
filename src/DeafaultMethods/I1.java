package DeafaultMethods;

public interface I1 
{
	public void m1();
	public void m2();
	default void m3() 
	{
		
	}
	//we can add default method in interface & use in any IC
	//not required to complete in all IC	
}
