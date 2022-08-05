class Sql_Trainer extends Trainer
{
	Sql_Trainer(String dept, String institute) 
	{
		super(dept, institute);
	}
	public static void main(String args[])
	{
		Trainer ram = new Sql_Trainer("CSE", "Payilagam");
		System.out.println(ram.dept);
		System.out.println(ram.institute);
		ram.training();
		System.out.println(ram.getSalary());
	}
}
