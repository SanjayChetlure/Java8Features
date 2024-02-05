package FunctionFI;

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


public class Function4_StudentInfo 
{
	public static void main(String[] args)
	{
		
		Function<Student, String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A [Distinction]";
			else if(marks>=60) grade="B [1st class]";
			else if(marks>=50) grade="C [2nd class]";
			else if(marks>=35) grade="D [3rd class]";
			else grade="E[failed]";    
			return grade;
			};
			
			Student[] s= {new Student("durga", 100),
					new Student("sunny", 65),
					new Student("bunny", 55),
					new Student("chinny", 45),
					new Student("vinny", 25)};
			
		Predicate<Student> p=s2->s2.marks>=60;
		
			for(Student s1:s)
			{
				if(p.test(s1)) {
				System.out.println("Student name:-"+s1.name);
				System.out.println("Student marks:-"+s1.marks);
				System.out.println("Student grade:-"+f.apply(s1));
				System.out.println("------");
				}
			}	
	}
}
