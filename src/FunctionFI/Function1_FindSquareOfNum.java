package FunctionFI;

import java.util.function.Function;

public class Function1_FindSquareOfNum 
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f=n->n*n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(4));
	}
}
