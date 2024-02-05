package PredicateFI;

import java.util.function.Predicate;

public class Predicate4_PredicateJoining 
{
	public static void main(String[] args) 
	{
		
		int [] ar= {50,1,40,21,5,100,200,61};
		
		//1: num should be Even & >10
		
		Predicate<Integer> p1=n->n%2==0;
		Predicate<Integer> p2=n->n>=10;
		
		System.out.println("Predicate1: and : Numbers with Even & >10");
		for(int n:ar)
		{
			if(p1.and(p2).test(n))
			{
				System.out.println(n);
			}
		}
		
		System.out.println("Predicate2: or : Numbers with Even or >10");
		for(int n:ar)
		{
			if(p1.or(p2).test(n))
			{
				System.out.println(n);
			}
		}
		
		
		System.out.println("Predicate3: negate : Numbers which are not even");
		for(int n:ar)
		{
			if(p1.negate().test(n))
			{
				System.out.println(n);
			}
		}
		
		
		
	}

}
