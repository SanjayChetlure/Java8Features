package PrimitiveVersionOfFI;

import java.util.function.IntFunction;

public class example2_IntFunction
{
	public static void main(String[] args)
	{
		
//		Function<Integer, Integer> f=n->n*n;
		IntFunction f=n->n*n;
		System.out.println(f.apply(10));
	
	}
}
