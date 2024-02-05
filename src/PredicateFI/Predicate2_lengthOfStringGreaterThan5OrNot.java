package PredicateFI;

import java.util.function.Predicate;

public class Predicate2_lengthOfStringGreaterThan5OrNot
{
	public static void main(String[] args) 
	{		
		Predicate<String> p=s->s.length()>5;
		System.out.println(p.test("rahul"));
		System.out.println(p.test("ab"));
		System.out.println(p.test("rahcnncsknsjul"));	
	}
}
