package FunctionFI;
import java.util.ArrayList;
import java.util.function.BiFunction;

class Student1 
{
	String sname;
	int srollnum;
	
	public Student1(String sname,int srollnum)
	{
		this.sname=sname;
		this.srollnum=srollnum;
	}
}


public class BiFunction1_ReturnObject 
{	
	public static void main(String[] args)
	{
		ArrayList<Student1> al=new ArrayList<>();
		
		BiFunction<String, Integer, Student1> bf=(sname,srollnum)-> new Student1(sname, srollnum);
		
		al.add(bf.apply("rahul",100));
		al.add(bf.apply("mahesh",200));
		al.add(bf.apply("ganesh",300));
		
		for(Student1 s1 : al)
		{
			System.out.println("Name : "+s1.sname);
			System.out.println("roll num: "+" : "+s1.srollnum);
			System.out.println();
		}	
	}
}
