package ConsumerFI;

import java.util.function.Consumer;

public class Consumer1_PrintMsg 
{
	public static void main(String[] args) 
	{
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("hi");
		c.accept("hello");
		
	}
}
