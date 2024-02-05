package FunctionFI;

import java.util.function.Function;

public class Function5_FunctionChaning
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f1=n->2*n;
		Function<Integer, Integer> f2=n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));
		// 2*2=4  --> 4*4*4 =64
		
		System.out.println(f1.compose(f2).apply(2));
		//2*2*2 =8  --> 2*8=16
	}
}
