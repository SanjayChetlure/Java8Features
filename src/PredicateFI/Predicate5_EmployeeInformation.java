package PredicateFI;
import java.util.ArrayList;
import java.util.function.Predicate;

class Employee 
{
	String name;
	double sal;
	
	public Employee(String name,double sal) 
	{
		this.name=name;
		this.sal=sal;
	}
}


public class Predicate5_EmployeeInformation
{
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee("rahul", 10000));
		al.add(new Employee("mahesh", 20000));
		al.add(new Employee("suresh", 50000));
		
		Predicate<Employee> p=e->e.sal>=30000;
		
		for(Employee e:al) 
		{
			//if(e.sal>=30000)
			if(p.test(e))
			{
				System.out.println(e.name+":- "+e.sal);
			}
		}
		
	}

}
