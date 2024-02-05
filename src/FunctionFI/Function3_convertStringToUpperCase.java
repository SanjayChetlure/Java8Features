package FunctionFI;

import java.util.function.Function;

public class Function3_convertStringToUpperCase
{
	public static void main(String[] args) 
	{
		Function<String, String> f=s->s.toUpperCase();
		System.out.println(f.apply("sanjay"));
		System.out.println(f.apply("abc"));
	}
}
