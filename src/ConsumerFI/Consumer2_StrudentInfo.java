package ConsumerFI;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}

public class Consumer2_StrudentInfo 
{
	public static void main(String[] args) 
	{
		
		Function<Student, String> f=s->
		{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A [Distinction]";
			else if(marks>=60) grade="B [1st class]";
			else if(marks>=50) grade="C [2nd class]";
			else if(marks>=35) grade="D [3rd class]";
			else grade="E[failed]";    
			return grade;
			};
									
		   Predicate<Student> p=s->s.marks>=60;
		   
		   Consumer<Student> c=s1->
		   {
			   System.out.println("Student name:-"+s1.name);
				System.out.println("Student marks:-"+s1.marks);
				System.out.println("Student grade:-"+f.apply(s1));
				System.out.println("------");
		   };
		   
		   
		   Student[] s= {new Student("durga", 100),
					new Student("sunny", 65),
					new Student("bunny", 55),
					new Student("chinny", 45),
					new Student("vinny", 25)};
		
			for(Student s1:s)
			{
				if(p.test(s1))
				{
					c.accept(s1);
				}
			}	
	}
}
