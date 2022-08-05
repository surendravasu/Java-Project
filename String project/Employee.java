
public class Employee 
{
	int salary;
	String name,designation;
	
	public static void main(String[] args)
	{
//		String name = new String("vasu");
//		System.out.println(name);
//		System.out.println(name.hashCode());
		Employee emp1 = new Employee("vasu","se",20000);
		Employee emp2 = new Employee ("jeeva", "webdesigner",40000);
		Employee emp3 = new Employee ( "mathan" ,"marketing",20000);
		System.out.println(emp1);
		
     }
	public Employee(String name,String designation,int salary)
	{
		
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
//	public String toString()
//	{
//		return "marketing";
//	}
	
	public String toString()
	{
		return this.name + " " + this.designation + " " + this.salary + " ";
	}

}
