package PredicateFI;

import java.util.function.BiPredicate;

public class BiPredicate1_EvenOdd 
{
	public static void main(String[] args)
	{
		BiPredicate<Integer,Integer> p= (a,b)->(a+b)%2==0; 
		System.out.println(p.test(10,10));
		System.out.println(p.test(11,11));	
	}
}
