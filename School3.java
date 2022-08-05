class School3 
{
	static String name;
	static int mark;
	
	School3(String name, int mark)
	{
		this.name = name;
		this.mark = mark;
		printStudDetails();
	}
	public static void main(String[] args) 
	{
		School3 sch1 = new School3("Vasu", 59);
		School3 sch2 = new School3("Mani", 80);
		System.out.println("**** Student Details ****");
		System.out.println("Name = " +name);
		System.out.println("Mark = "+mark);
	}
	
	void printStudDetails()
	{
		System.out.println("**** Student Details ****");
		System.out.println("Name = " +name);
		System.out.println("Mark = "+mark);
	}
}