package ConsumerFI;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumer2_updateStudentMarksBy5 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<>();
		addData(al);
		
		BiConsumer<Student, Integer> bc=(stu,extramark)-> stu.marks=stu.marks+extramark;
		
		for(Student s1:al)
		{
			bc.accept(s1, 5);
		}
		
		for(Student s1:al)
		{
			System.out.println(s1.name+" : "+s1.marks);
		}
	}
	
	public static void addData(ArrayList<Student> l)
	{
	
		l.add(new Student("rahul", 50));
		l.add(new Student("mahesh", 60));
		l.add(new Student("ganesh", 70));
		l.add(new Student("suresh", 80));
	}
	

}
