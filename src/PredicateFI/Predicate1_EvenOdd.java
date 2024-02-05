package PredicateFI;

import java.util.function.Predicate;

public class Predicate1_EvenOdd 
{
	public static void main(String[] args)
	{
		Predicate<Integer> p= n->n%2==0; 
		System.out.println(p.test(10));
		System.out.println(p.test(11));	
	}
}
