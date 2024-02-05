package PredicateFI;

import java.util.function.Predicate;

public class Predicate3_PrintStringFromArrayWhoseLengthGreaterThan5
{

	public static void main(String[] args)
	{
		
		String s1 []= {"abc","abcd","hasdhd","cnjcbjkwd"};
		
		Predicate<String> p=s->s.length()>5;
		for(String s:s1) 
		{
			if(p.test(s))
			{
				System.out.println(s);
			}			
		}	
	}
}
