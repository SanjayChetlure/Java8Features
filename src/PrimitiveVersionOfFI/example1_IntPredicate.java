package PrimitiveVersionOfFI;

import java.util.function.IntPredicate;

public class example1_IntPredicate
{
	public static void main(String[] args)
	{
		int [] x= {10,30,11,23,40};
		//Predicate<Integer> p=n->n%2==0;
		IntPredicate p=n->n%2==0;
		
		for(int x1:x)
		{
			if(p.test(x1))
			{
				System.out.println(x1);
			}
		}
	}
}
