package FunctionFI;

import java.util.function.Function;

public class Function2_FindLengthOfString
{
	public static void main(String[] args) 
	{
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("sanjay"));
		System.out.println(f.apply("abc"));
	}
}
