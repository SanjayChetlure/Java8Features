package ConsumerFI;

import java.util.function.BiConsumer;

public class BiConsumer1_PrintMsg 
{
	public static void main(String[] args) 
	{
		
		BiConsumer<String,Integer> bc=(sname,srollNum)->
		{
			System.out.println("name: "+sname);
			System.out.println("rollnum: "+srollNum);
		};
		
		
		bc.accept("rahul", 10);
		
	}
}
