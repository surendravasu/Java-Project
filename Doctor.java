class Doctor
{
static String name="hospital";
static int doorno=123;
int offer=5;
	private int profit = 30;
	
	public static void main(String[] args)
	{
		Doctor people = new Doctor();
		System.out.println(people.profit);
		people.promote();
	}
	private void promote()
	{
		System.out.println("promotion");
	}
	
void tablet()
{
System.out.println("bill something");
}
void insurance()
{
System.out.println("aetna insurance");
}
}
