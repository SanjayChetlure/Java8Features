package ForEachMethod;

import java.util.ArrayList;

public class example1 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("rahul");
		al.add("ganesh");
		al.add("mahesh");
		
		al.forEach(i->System.out.println(i));
		
		System.out.println("----");
		
		al.forEach(i->System.out.println(i.length()));
		
		System.out.println("--------");
		
		al.forEach(i->System.out.println(i+i));
				
	}

}
