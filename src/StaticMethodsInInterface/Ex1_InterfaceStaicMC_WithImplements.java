package StaticMethodsInInterface;

interface I1 
{
	public static void m1() 
	{
		System.out.println("method m1 from Interface I1");
	}
}


public class Ex1_InterfaceStaicMC_WithImplements implements I1 
{
	public static void main(String[] args) 
	{
		I1.m1();    //InterfaceName.methodname()
		//m1();   invalid
		//Test.m1();    //invalid
		//Test t=new Test();
		//t.m1();           //invalid
	}
}
