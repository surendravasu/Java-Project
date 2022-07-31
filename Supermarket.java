class Supermarket
{
	static String name="murugan";
	static int doorno=4567;
	int offer=7;
	private int profit=20;
	public static void main(String[] args)
{
		Supermarket emp= new Supermarket();
		System.out.println(emp.profit);
		emp.promote();
	}
	private void promote()
	{
		System.out.println("promotion");
		
	}
		
	
 void buy()
{
System.out.println("buying something");
}
 void give_offer()
{
System.out.println("Offers");
}
}

